package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterSkillDto;
import com.mtx.argservr.dto.response.SkillDto;
import com.mtx.argservr.model.Skill;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkillMapper {

    Skill toSkill(RegisterSkillDto dto);

    SkillDto toDto(Skill skill);

    List<SkillDto> toDtoList(List<Skill> list);
}
