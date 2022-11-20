package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.request.UpdateProjectDto;
import com.mtx.argservr.dto.response.ProjectDto;
import com.mtx.argservr.exception.ResourceNotFoundException;
import com.mtx.argservr.mapper.ProjectMapper;
import com.mtx.argservr.model.Project;
import com.mtx.argservr.repository.ProjectRepository;
import com.mtx.argservr.service.IProjectService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public ProjectDto save(RegisterProjectDto dto) {
        Project project = projectMapper.toProject(dto);
        Project saved = projectRepository.save(project);
        return projectMapper.toDto(saved);
    }

    @Override
    public List<ProjectDto> getAll() {
        return projectMapper.toDtoList(projectRepository.findAll());
    }
    
    @Override
    public ProjectDto update(Long id, UpdateProjectDto dto){
        if (!projectRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        Project project = projectRepository.findById(id).get();
        project = projectMapper.update(dto, project);
        Project saved = projectRepository.save(project);
        return projectMapper.toDto(saved);
    }

}
