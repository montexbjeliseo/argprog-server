package com.mtx.argservr.controller;

import com.mtx.argservr.dto.request.RegisterEducationDto;
import com.mtx.argservr.dto.request.UpdateEducationDto;
import com.mtx.argservr.service.IEducationService;
import com.mtx.argservr.util.Constants.Endpoints;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.EDUCATION)
public class EducationController {

    @Autowired
    private IEducationService educationService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody RegisterEducationDto dto) {
        return new ResponseEntity<>(educationService.save(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(educationService.getAll(), HttpStatus.OK);
    }

    @PatchMapping(Endpoints.ID)
    public ResponseEntity<?> update(@PathVariable Long id, @Valid @RequestBody UpdateEducationDto dto) {
        return new ResponseEntity<>(educationService.update(id, dto), HttpStatus.OK);
    }
}
