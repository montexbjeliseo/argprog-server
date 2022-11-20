package com.mtx.argservr.security.controller;

import com.mtx.argservr.security.dto.request.UpdateUserDto;
import com.mtx.argservr.security.service.IUserService;
import com.mtx.argservr.util.Constants.Endpoints;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.AUTH)
public class UserController {

    @Autowired
    private IUserService userService;

    @PatchMapping
    public ResponseEntity<?> update(@Valid @RequestBody UpdateUserDto dto) {
        return new ResponseEntity<>(userService.update(dto), HttpStatus.OK);
    }

}
