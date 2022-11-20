package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterExperienceDto;
import com.mtx.argservr.dto.request.UpdateExperienceDto;
import com.mtx.argservr.dto.response.ExperienceDto;
import com.mtx.argservr.model.Experience;
import java.util.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ExperienceMapper {

    Experience toExperience(RegisterExperienceDto dto);

    ExperienceDto toDto(Experience dto);

    List<ExperienceDto> toDtoList(List<Experience> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Experience update(UpdateExperienceDto dto, @MappingTarget Experience experience);
}
