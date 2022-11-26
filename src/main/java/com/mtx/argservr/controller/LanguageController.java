package com.mtx.argservr.controller;

import com.mtx.argservr.dto.request.RegisterLanguageDto;
import com.mtx.argservr.dto.request.UpdateLanguageDto;
import com.mtx.argservr.service.ILanguageService;
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
@RequestMapping(Endpoints.LANGUAGE)
public class LanguageController {

    @Autowired
    private ILanguageService languageService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody RegisterLanguageDto dto) {
        return new ResponseEntity<>(languageService.save(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(languageService.getAll(), HttpStatus.OK);
    }

    @PatchMapping(Endpoints.ID)
    public ResponseEntity<?> update(@PathVariable Long id, @Valid @RequestBody UpdateLanguageDto dto) {
        return new ResponseEntity<>(languageService.update(id, dto), HttpStatus.OK);
    }
    
    @DeleteMapping(Endpoints.ID)
    public ResponseEntity<?> delete(@PathVariable Long id){
        return new ResponseEntity<>(languageService.delete(id), HttpStatus.OK);
    }
}
