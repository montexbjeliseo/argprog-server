package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterExperienceDto;
import com.mtx.argservr.dto.request.UpdateExperienceDto;
import com.mtx.argservr.dto.response.ExperienceDto;
import com.mtx.argservr.model.Experience;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-29T17:59:04-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class ExperienceMapperImpl implements ExperienceMapper {

    @Override
    public Experience toExperience(RegisterExperienceDto dto) {
        if ( dto == null ) {
            return null;
        }

        Experience experience = new Experience();

        experience.setTitle( dto.getTitle() );
        experience.setDescription( dto.getDescription() );
        experience.setPhoto( dto.getPhoto() );
        experience.setInstitution( dto.getInstitution() );
        experience.setAboutInstitution( dto.getAboutInstitution() );
        experience.setIndexPosition( dto.getIndexPosition() );

        return experience;
    }

    @Override
    public ExperienceDto toDto(Experience dto) {
        if ( dto == null ) {
            return null;
        }

        ExperienceDto experienceDto = new ExperienceDto();

        experienceDto.setId( dto.getId() );
        experienceDto.setTitle( dto.getTitle() );
        experienceDto.setDescription( dto.getDescription() );
        experienceDto.setPhoto( dto.getPhoto() );
        experienceDto.setInstitution( dto.getInstitution() );
        experienceDto.setAboutInstitution( dto.getAboutInstitution() );
        experienceDto.setIndexPosition( dto.getIndexPosition() );

        return experienceDto;
    }

    @Override
    public List<ExperienceDto> toDtoList(List<Experience> list) {
        if ( list == null ) {
            return null;
        }

        List<ExperienceDto> list1 = new ArrayList<ExperienceDto>( list.size() );
        for ( Experience experience : list ) {
            list1.add( toDto( experience ) );
        }

        return list1;
    }

    @Override
    public Experience update(UpdateExperienceDto dto, Experience experience) {
        if ( dto == null ) {
            return null;
        }

        if ( dto.getTitle() != null ) {
            experience.setTitle( dto.getTitle() );
        }
        if ( dto.getDescription() != null ) {
            experience.setDescription( dto.getDescription() );
        }
        if ( dto.getPhoto() != null ) {
            experience.setPhoto( dto.getPhoto() );
        }
        if ( dto.getInstitution() != null ) {
            experience.setInstitution( dto.getInstitution() );
        }
        if ( dto.getAboutInstitution() != null ) {
            experience.setAboutInstitution( dto.getAboutInstitution() );
        }
        if ( dto.getIndexPosition() != null ) {
            experience.setIndexPosition( dto.getIndexPosition() );
        }

        return experience;
    }
}
