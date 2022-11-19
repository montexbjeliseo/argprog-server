package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterSocialMediaDto;
import com.mtx.argservr.dto.response.SocialMediaDto;
import com.mtx.argservr.model.SocialMedia;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocialMediaMapper {

    SocialMedia toSocialMedia(RegisterSocialMediaDto dto);

    SocialMediaDto toDto(SocialMedia socialMedia);

    List<SocialMediaDto> toDtoList(List<SocialMedia> list);
}
