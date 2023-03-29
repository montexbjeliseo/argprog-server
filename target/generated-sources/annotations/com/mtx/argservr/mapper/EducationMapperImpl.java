package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterEducationDto;
import com.mtx.argservr.dto.request.UpdateEducationDto;
import com.mtx.argservr.dto.response.EducationDto;
import com.mtx.argservr.model.Education;
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
public class EducationMapperImpl implements EducationMapper {

    @Override
    public Education toEducation(RegisterEducationDto dto) {
        if ( dto == null ) {
            return null;
        }

        Education education = new Education();

        education.setTitle( dto.getTitle() );
        education.setDescription( dto.getDescription() );
        education.setPhoto( dto.getPhoto() );
        education.setInstitution( dto.getInstitution() );
        education.setAboutInstitution( dto.getAboutInstitution() );
        education.setIndexPosition( dto.getIndexPosition() );

        return education;
    }

    @Override
    public EducationDto toDto(Education education) {
        if ( education == null ) {
            return null;
        }

        EducationDto educationDto = new EducationDto();

        educationDto.setId( education.getId() );
        educationDto.setTitle( education.getTitle() );
        educationDto.setDescription( education.getDescription() );
        educationDto.setPhoto( education.getPhoto() );
        educationDto.setInstitution( education.getInstitution() );
        educationDto.setAboutInstitution( education.getAboutInstitution() );
        educationDto.setIndexPosition( education.getIndexPosition() );

        return educationDto;
    }

    @Override
    public List<EducationDto> toDtoList(List<Education> list) {
        if ( list == null ) {
            return null;
        }

        List<EducationDto> list1 = new ArrayList<EducationDto>( list.size() );
        for ( Education education : list ) {
            list1.add( toDto( education ) );
        }

        return list1;
    }

    @Override
    public Education update(UpdateEducationDto dto, Education education) {
        if ( dto == null ) {
            return null;
        }

        if ( dto.getTitle() != null ) {
            education.setTitle( dto.getTitle() );
        }
        if ( dto.getDescription() != null ) {
            education.setDescription( dto.getDescription() );
        }
        if ( dto.getPhoto() != null ) {
            education.setPhoto( dto.getPhoto() );
        }
        if ( dto.getInstitution() != null ) {
            education.setInstitution( dto.getInstitution() );
        }
        if ( dto.getAboutInstitution() != null ) {
            education.setAboutInstitution( dto.getAboutInstitution() );
        }
        if ( dto.getIndexPosition() != null ) {
            education.setIndexPosition( dto.getIndexPosition() );
        }

        return education;
    }
}
