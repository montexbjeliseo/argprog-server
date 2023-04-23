package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterProjectDto;
import com.mtx.argservr.dto.request.UpdateProjectDto;
import com.mtx.argservr.dto.response.ProjectDto;
import com.mtx.argservr.model.Project;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-23T19:00:06-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.19 (Microsoft)"
)
@Component
public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public Project toProject(RegisterProjectDto dto) {
        if ( dto == null ) {
            return null;
        }

        Project project = new Project();

        project.setTitle( dto.getTitle() );
        project.setDescription( dto.getDescription() );
        project.setPhoto( dto.getPhoto() );
        project.setInstitution( dto.getInstitution() );
        project.setAboutInstitution( dto.getAboutInstitution() );
        project.setIndexPosition( dto.getIndexPosition() );

        return project;
    }

    @Override
    public ProjectDto toDto(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        projectDto.setId( project.getId() );
        projectDto.setTitle( project.getTitle() );
        projectDto.setDescription( project.getDescription() );
        projectDto.setPhoto( project.getPhoto() );
        projectDto.setInstitution( project.getInstitution() );
        projectDto.setAboutInstitution( project.getAboutInstitution() );
        projectDto.setIndexPosition( project.getIndexPosition() );

        return projectDto;
    }

    @Override
    public List<ProjectDto> toDtoList(List<Project> list) {
        if ( list == null ) {
            return null;
        }

        List<ProjectDto> list1 = new ArrayList<ProjectDto>( list.size() );
        for ( Project project : list ) {
            list1.add( toDto( project ) );
        }

        return list1;
    }

    @Override
    public Project update(UpdateProjectDto dto, Project project) {
        if ( dto == null ) {
            return null;
        }

        if ( dto.getTitle() != null ) {
            project.setTitle( dto.getTitle() );
        }
        if ( dto.getDescription() != null ) {
            project.setDescription( dto.getDescription() );
        }
        if ( dto.getPhoto() != null ) {
            project.setPhoto( dto.getPhoto() );
        }
        if ( dto.getInstitution() != null ) {
            project.setInstitution( dto.getInstitution() );
        }
        if ( dto.getAboutInstitution() != null ) {
            project.setAboutInstitution( dto.getAboutInstitution() );
        }
        if ( dto.getIndexPosition() != null ) {
            project.setIndexPosition( dto.getIndexPosition() );
        }

        return project;
    }
}
