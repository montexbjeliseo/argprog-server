package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.request.UpdateProjectDto;
import com.mtx.argservr.dto.response.ProjectDto;
import com.mtx.argservr.model.Project;
import java.util.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    Project toProject(RegisterProjectDto dto);

    ProjectDto toDto(Project project);

    List<ProjectDto> toDtoList(List<Project> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Project update(UpdateProjectDto dto, @MappingTarget Project project);
}
