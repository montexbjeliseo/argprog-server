package com.mtx.argservr.security.service;

import com.mtx.argservr.security.dto.request.LoginUserDto;
import com.mtx.argservr.security.dto.request.RegisterUserDto;
import com.mtx.argservr.security.dto.response.RegisteredUserDto;
import com.mtx.argservr.security.dto.response.TokenInfo;

public interface IAuthService {

    RegisteredUserDto register(RegisterUserDto dto);

    TokenInfo login(LoginUserDto dto);
}
