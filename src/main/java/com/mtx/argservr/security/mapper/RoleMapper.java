package com.mtx.argservr.security.mapper;

import com.mtx.argservr.security.dto.response.RoleDto;
import com.mtx.argservr.security.model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDto toDto(Role role);
}
