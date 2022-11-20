package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.request.UpdateProjectDto;
import com.mtx.argservr.dto.response.ProjectDto;
import java.util.List;

public interface IProjectService {

    ProjectDto save(RegisterProjectDto dto);

    List<ProjectDto> getAll();
    
    ProjectDto update(Long id, UpdateProjectDto dto);
}
