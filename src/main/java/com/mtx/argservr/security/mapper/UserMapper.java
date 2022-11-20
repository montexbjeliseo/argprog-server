package com.mtx.argservr.security.mapper;

import com.mtx.argservr.security.dto.request.RegisterUserDto;
import com.mtx.argservr.security.dto.request.UpdateUserDto;
import com.mtx.argservr.security.dto.response.RegisteredUserDto;
import com.mtx.argservr.security.dto.response.UserDto;
import com.mtx.argservr.security.model.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(RegisterUserDto dto);

    RegisteredUserDto toRegisteredDto(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User update(UpdateUserDto dto, @MappingTarget User user);

    UserDto toDto(User user);
}
