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
    date = "2023-04-23T19:00:08-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.19 (Microsoft)"
)
@Component
public class SkillMapperImpl implements SkillMapper {

    @Override
    public Skill toSkill(RegisterSkillDto dto) {
        if ( dto == null ) {
            return null;
        }

        Skill skill = new Skill();

        skill.setName( dto.getName() );
        skill.setDescription( dto.getDescription() );
        skill.setPhoto( dto.getPhoto() );

        return skill;
    }

    @Override
    public SkillDto toDto(Skill skill) {
        if ( skill == null ) {
            return null;
        }

        SkillDto skillDto = new SkillDto();

        skillDto.setId( skill.getId() );
        skillDto.setName( skill.getName() );
        skillDto.setDescription( skill.getDescription() );
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

        if ( dto.getName() != null ) {
            skill.setName( dto.getName() );
        }
        if ( dto.getDescription() != null ) {
            skill.setDescription( dto.getDescription() );
        }
        if ( dto.getPhoto() != null ) {
            skill.setPhoto( dto.getPhoto() );
        }

        return skill;
    }
}
