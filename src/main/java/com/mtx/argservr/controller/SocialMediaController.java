package com.mtx.argservr.controller;

import com.mtx.argservr.dto.request.RegisterSocialMediaDto;
import com.mtx.argservr.service.ISocialMediaService;
import com.mtx.argservr.util.Constants.Endpoints;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.SOCIAL_MEDIA)
public class SocialMediaController {

    private ISocialMediaService socialMediaService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody RegisterSocialMediaDto dto) {
        return new ResponseEntity<>(socialMediaService.save(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(socialMediaService.getAll(), HttpStatus.OK);
    }
}
