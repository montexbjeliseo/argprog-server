package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterLinkDto;
import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.request.UpdateLinkDto;
import com.mtx.argservr.dto.request.UpdateProjectDto;
import com.mtx.argservr.dto.response.LinkDto;
import com.mtx.argservr.dto.response.ProjectDto;
import com.mtx.argservr.exception.ResourceNotFoundException;
import com.mtx.argservr.mapper.ProjectMapper;
import com.mtx.argservr.model.Link;
import com.mtx.argservr.model.Project;
import com.mtx.argservr.repository.ProjectRepository;
import com.mtx.argservr.security.repository.LinkRepository;
import com.mtx.argservr.service.IProjectService;
import java.util.HashSet;
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

    @Autowired
    private LinkRepository linkRepository;

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
    public ProjectDto update(Long id, UpdateProjectDto dto) {
        if (!projectRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        Project project = projectRepository.findById(id).get();
        project = projectMapper.update(dto, project);
        Project saved = projectRepository.save(project);
        return projectMapper.toDto(saved);
    }

    @Override
    public ProjectDto delete(Long id) {
        if (!projectRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        Project project = projectRepository.findById(id).get();
        projectRepository.deleteById(id);
        return projectMapper.toDto(project);
    }

    @Override
    public LinkDto addLink(Long id, RegisterLinkDto dto) {
        if (!projectRepository.existsById(id)) {
            throw new ResourceNotFoundException("No existe un proyecto con ese con id: " + id);
        }

        Project project = projectRepository.findById(id).get();

        if (project.getLinks() == null) {
            project.setLinks(new HashSet<>());
        }

        Link link = projectMapper.toLink(dto);

        link.setProject(project);

        link = linkRepository.save(link);

        return projectMapper.toLinkDto(link);

    }

    @Override
    public LinkDto updateLink(Long id, Long linkId, UpdateLinkDto dto) {
        if (!projectRepository.existsById(id)) {
            throw new ResourceNotFoundException("No existe un proyecto con ese con id: " + id);
        }

        Project project = projectRepository.findById(id).get();

        if (project.getLinks() == null) {
            throw new ResourceNotFoundException("No existe un link asociado con ese con id: " + id);
        }

        if (!project.getLinks().stream().anyMatch((p) -> {
            return p.getId() == linkId;
        })) {
            throw new ResourceNotFoundException("No existe un link asociado con ese con id: " + id);
        }

        Link link = linkRepository.findById(linkId).get();

        link = projectMapper.update(dto, link);

        link = linkRepository.save(link);

        return projectMapper.toLinkDto(link);

    }

    @Override
    public LinkDto deleteLink(Long id, Long linkId) {
        if (!projectRepository.existsById(id)) {
            throw new ResourceNotFoundException("No existe un proyecto con ese con id: " + id);
        }

        Project project = projectRepository.findById(id).get();

        if (project.getLinks() == null) {
            throw new ResourceNotFoundException("No existe un link asociado con ese con id: " + id);
        }

        if (!project.getLinks().stream().anyMatch((p) -> {
            return p.getId() == linkId;
        })) {
            throw new ResourceNotFoundException("No existe un link asociado con ese con id: " + id);
        }

        Link link = linkRepository.findById(linkId).get();

        project.getLinks().remove(link);
        
        projectRepository.save(project);

        return projectMapper.toLinkDto(link);
    }

}
