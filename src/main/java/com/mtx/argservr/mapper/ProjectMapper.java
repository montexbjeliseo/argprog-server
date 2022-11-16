package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.response.ProjectDto;
import com.mtx.argservr.model.Project;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    Project toProject(RegisterProjectDto dto);

    ProjectDto toDto(Project project);

    List<ProjectDto> toDtoList(List<Project> list);
}
