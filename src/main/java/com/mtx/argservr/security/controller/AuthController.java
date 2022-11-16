package com.mtx.argservr.security.controller;

import com.mtx.argservr.security.dto.request.LoginUserDto;
import com.mtx.argservr.security.dto.request.RegisterUserDto;
import com.mtx.argservr.security.service.IAuthService;
import com.mtx.argservr.util.Constants.Endpoints;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.AUTH)
public class AuthController {

    @Autowired
    private IAuthService authService;

    @PostMapping(Endpoints.REGISTER)
    public ResponseEntity<?> register(@Valid @RequestBody RegisterUserDto dto) {
        return new ResponseEntity<>(authService.register(dto), HttpStatus.OK);
    }
    
    @PostMapping(Endpoints.LOGIN)
    public ResponseEntity<?> login(@Valid @RequestBody LoginUserDto dto){
        return new ResponseEntity<>(authService.login(dto), HttpStatus.OK);
    }
}
