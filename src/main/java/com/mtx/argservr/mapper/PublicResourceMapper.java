package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.response.PublicResource;
import com.mtx.argservr.security.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublicResourceMapper {

    PublicResource toPR(User user);
}
