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
    date = "2023-04-23T21:36:00-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public Project toProject(RegisterProjectDto dto) {
        if ( dto == null ) {
            return null;
        }

        Project project = new Project();

        project.setAboutInstitution( dto.getAboutInstitution() );
        project.setDescription( dto.getDescription() );
        project.setIndexPosition( dto.getIndexPosition() );
        project.setInstitution( dto.getInstitution() );
        project.setPhoto( dto.getPhoto() );
        project.setTitle( dto.getTitle() );

        return project;
    }

    @Override
    public ProjectDto toDto(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        projectDto.setAboutInstitution( project.getAboutInstitution() );
        projectDto.setDescription( project.getDescription() );
        projectDto.setId( project.getId() );
        projectDto.setIndexPosition( project.getIndexPosition() );
        projectDto.setInstitution( project.getInstitution() );
        projectDto.setPhoto( project.getPhoto() );
        projectDto.setTitle( project.getTitle() );

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

        if ( dto.getAboutInstitution() != null ) {
            project.setAboutInstitution( dto.getAboutInstitution() );
        }
        if ( dto.getDescription() != null ) {
            project.setDescription( dto.getDescription() );
        }
        if ( dto.getIndexPosition() != null ) {
            project.setIndexPosition( dto.getIndexPosition() );
        }
        if ( dto.getInstitution() != null ) {
            project.setInstitution( dto.getInstitution() );
        }
        if ( dto.getPhoto() != null ) {
            project.setPhoto( dto.getPhoto() );
        }
        if ( dto.getTitle() != null ) {
            project.setTitle( dto.getTitle() );
        }

        return project;
    }
}
