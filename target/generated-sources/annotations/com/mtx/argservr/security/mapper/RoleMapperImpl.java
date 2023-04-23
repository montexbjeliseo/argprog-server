package com.mtx.argservr.security.mapper;

import com.mtx.argservr.security.dto.response.RoleDto;
import com.mtx.argservr.security.model.Role;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-23T18:43:55-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.19 (Microsoft)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto toDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setName( role.getName() );
        roleDto.setDescription( role.getDescription() );

        return roleDto;
    }
}
