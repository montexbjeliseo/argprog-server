package com.mtx.argservr.security.service;

import com.mtx.argservr.security.dto.request.UpdateUserDto;
import com.mtx.argservr.security.dto.response.UserDto;

public interface IUserService {

    UserDto update(UpdateUserDto dto);
}
