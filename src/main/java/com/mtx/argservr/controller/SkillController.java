package com.mtx.argservr.controller;

import com.mtx.argservr.dto.request.RegisterSkillDto;
import com.mtx.argservr.dto.request.UpdateSkillDto;
import com.mtx.argservr.service.ISkillService;
import com.mtx.argservr.util.Constants.Endpoints;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.SKILL)
public class SkillController {

    @Autowired
    private ISkillService skillService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody RegisterSkillDto dto) {
        return new ResponseEntity<>(skillService.save(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(skillService.getAll(), HttpStatus.OK);
    }
    
    @PatchMapping(Endpoints.ID)
    public ResponseEntity<?> update(@PathVariable Long id, @Valid @RequestBody UpdateSkillDto dto) {
        return new ResponseEntity<>(skillService.update(id, dto), HttpStatus.OK);
    }
    
    @DeleteMapping(Endpoints.ID)
    public ResponseEntity<?> delete(@PathVariable Long id){
        return new ResponseEntity<>(skillService.delete(id), HttpStatus.OK);
    }
}
