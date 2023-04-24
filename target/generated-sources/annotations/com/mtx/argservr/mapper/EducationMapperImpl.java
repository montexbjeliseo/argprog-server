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
    date = "2023-04-23T21:35:58-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class EducationMapperImpl implements EducationMapper {

    @Override
    public Education toEducation(RegisterEducationDto dto) {
        if ( dto == null ) {
            return null;
        }

        Education education = new Education();

        education.setAboutInstitution( dto.getAboutInstitution() );
        education.setDescription( dto.getDescription() );
        education.setIndexPosition( dto.getIndexPosition() );
        education.setInstitution( dto.getInstitution() );
        education.setPhoto( dto.getPhoto() );
        education.setTitle( dto.getTitle() );

        return education;
    }

    @Override
    public EducationDto toDto(Education education) {
        if ( education == null ) {
            return null;
        }

        EducationDto educationDto = new EducationDto();

        educationDto.setAboutInstitution( education.getAboutInstitution() );
        educationDto.setDescription( education.getDescription() );
        educationDto.setId( education.getId() );
        educationDto.setIndexPosition( education.getIndexPosition() );
        educationDto.setInstitution( education.getInstitution() );
        educationDto.setPhoto( education.getPhoto() );
        educationDto.setTitle( education.getTitle() );

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

        if ( dto.getAboutInstitution() != null ) {
            education.setAboutInstitution( dto.getAboutInstitution() );
        }
        if ( dto.getDescription() != null ) {
            education.setDescription( dto.getDescription() );
        }
        if ( dto.getIndexPosition() != null ) {
            education.setIndexPosition( dto.getIndexPosition() );
        }
        if ( dto.getInstitution() != null ) {
            education.setInstitution( dto.getInstitution() );
        }
        if ( dto.getPhoto() != null ) {
            education.setPhoto( dto.getPhoto() );
        }
        if ( dto.getTitle() != null ) {
            education.setTitle( dto.getTitle() );
        }

        return education;
    }
}
