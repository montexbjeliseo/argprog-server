package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterLinkDto;
import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.request.UpdateLinkDto;
import com.mtx.argservr.dto.request.UpdateProjectDto;
import com.mtx.argservr.dto.response.LinkDto;
import com.mtx.argservr.dto.response.ProjectDto;
import java.util.List;

public interface IProjectService {

    ProjectDto save(RegisterProjectDto dto);

    List<ProjectDto> getAll();

    ProjectDto update(Long id, UpdateProjectDto dto);

    ProjectDto delete(Long id);

    LinkDto addLink(Long id, RegisterLinkDto dto);

    LinkDto updateLink(Long id, Long linkId, UpdateLinkDto dto);

    LinkDto deleteLink(Long id, Long linkId);
}
