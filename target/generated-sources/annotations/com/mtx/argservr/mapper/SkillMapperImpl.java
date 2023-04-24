package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterSkillDto;
import com.mtx.argservr.dto.request.UpdateSkillDto;
import com.mtx.argservr.dto.response.SkillDto;
import com.mtx.argservr.model.Skill;
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
public class SkillMapperImpl implements SkillMapper {

    @Override
    public Skill toSkill(RegisterSkillDto dto) {
        if ( dto == null ) {
            return null;
        }

        Skill skill = new Skill();

        skill.setDescription( dto.getDescription() );
        skill.setName( dto.getName() );
        skill.setPhoto( dto.getPhoto() );

        return skill;
    }

    @Override
    public SkillDto toDto(Skill skill) {
        if ( skill == null ) {
            return null;
        }

        SkillDto skillDto = new SkillDto();

        skillDto.setDescription( skill.getDescription() );
        skillDto.setId( skill.getId() );
        skillDto.setName( skill.getName() );
        skillDto.setPhoto( skill.getPhoto() );

        return skillDto;
    }

    @Override
    public List<SkillDto> toDtoList(List<Skill> list) {
        if ( list == null ) {
            return null;
        }

        List<SkillDto> list1 = new ArrayList<SkillDto>( list.size() );
        for ( Skill skill : list ) {
            list1.add( toDto( skill ) );
        }

        return list1;
    }

    @Override
    public Skill update(UpdateSkillDto dto, Skill skill) {
        if ( dto == null ) {
            return null;
        }

        if ( dto.getDescription() != null ) {
            skill.setDescription( dto.getDescription() );
        }
        if ( dto.getName() != null ) {
            skill.setName( dto.getName() );
        }
        if ( dto.getPhoto() != null ) {
            skill.setPhoto( dto.getPhoto() );
        }

        return skill;
    }
}
