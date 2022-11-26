package com.mtx.argservr.controller;

import com.mtx.argservr.dto.request.RegisterSocialMediaDto;
import com.mtx.argservr.dto.request.UpdateSocialMediaDto;
import com.mtx.argservr.service.ISocialMediaService;
import com.mtx.argservr.util.Constants.Endpoints;
import javax.validation.Valid;
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

    @PatchMapping(Endpoints.ID)
    public ResponseEntity<?> update(@PathVariable Long id, @Valid UpdateSocialMediaDto dto) {
        return new ResponseEntity<>(socialMediaService.update(id, dto), HttpStatus.OK);
    }
    
    @DeleteMapping(Endpoints.ID)
    public ResponseEntity<?> delete(@PathVariable Long id){
        return new ResponseEntity<>(socialMediaService.delete(id), HttpStatus.OK);
    }
}
