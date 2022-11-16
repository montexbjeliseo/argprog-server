package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterEducationDto;
import com.mtx.argservr.dto.response.EducationDto;
import com.mtx.argservr.model.Education;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EducationMapper {

    Education toEducation(RegisterEducationDto dto);

    EducationDto toDto(Education education);

    List<EducationDto> toDtoList(List<Education> list);
}
