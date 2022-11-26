package com.mtx.argservr.controller;

import com.mtx.argservr.dto.request.RegisterExperienceDto;
import com.mtx.argservr.dto.request.UpdateExperienceDto;
import com.mtx.argservr.service.IExperienceService;
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
@RequestMapping(Endpoints.EXPERIENCE)
public class ExperienceController {

    @Autowired
    private IExperienceService experienceService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody RegisterExperienceDto dto) {
        return new ResponseEntity<>(experienceService.save(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(experienceService.getAll(), HttpStatus.OK);
    }

    @PatchMapping(Endpoints.ID)
    public ResponseEntity<?> update(@PathVariable Long id, @Valid @RequestBody UpdateExperienceDto dto) {
        return new ResponseEntity<>(experienceService.update(id, dto), HttpStatus.OK);
    }
    
    @DeleteMapping(Endpoints.ID)
    public ResponseEntity<?> delete(@PathVariable Long id){
        return new ResponseEntity<>(experienceService.delete(id), HttpStatus.OK);
    }
}
