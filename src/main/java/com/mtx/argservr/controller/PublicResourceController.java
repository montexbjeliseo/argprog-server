package com.mtx.argservr.controller;

import com.mtx.argservr.service.IPublicResourceService;
import com.mtx.argservr.util.Constants.Endpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.PUBLIC_RESOURCE)
public class PublicResourceController {

    @Autowired
    private IPublicResourceService publicResourceService;

    @GetMapping
    public ResponseEntity<?> getInfo() {
        return new ResponseEntity<>(publicResourceService.get(), HttpStatus.OK);
    }
}
