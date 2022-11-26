package com.mtx.argservr.controller;

import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.request.UpdateProjectDto;
import com.mtx.argservr.service.IProjectService;
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
@RequestMapping(Endpoints.PROJECT)
public class ProjectController {

    @Autowired
    private IProjectService projectService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody RegisterProjectDto dto) {
        return new ResponseEntity<>(projectService.save(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(projectService.getAll(), HttpStatus.OK);
    }
    
    @PatchMapping(Endpoints.ID)
    public ResponseEntity<?> update(@PathVariable Long id, @Valid @RequestBody UpdateProjectDto dto) {
        return new ResponseEntity<>(projectService.update(id, dto), HttpStatus.OK);
    }
    
    @DeleteMapping(Endpoints.ID)
    public ResponseEntity<?> delete(@PathVariable Long id){
        return new ResponseEntity<>(projectService.delete(id), HttpStatus.OK);
    }
}
