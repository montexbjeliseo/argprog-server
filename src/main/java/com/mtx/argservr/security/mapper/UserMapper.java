package com.mtx.argservr.security.mapper;

import com.mtx.argservr.security.dto.request.RegisterUserDto;
import com.mtx.argservr.security.dto.response.RegisteredUserDto;
import com.mtx.argservr.security.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(RegisterUserDto dto);

    RegisteredUserDto toRegisteredDto(User user);
}
