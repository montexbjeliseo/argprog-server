package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterSkillDto;
import com.mtx.argservr.dto.request.UpdateSkillDto;
import com.mtx.argservr.dto.response.SkillDto;
import java.util.List;

public interface ISkillService {

    SkillDto save(RegisterSkillDto dto);

    List<SkillDto> getAll();

    SkillDto update(Long id, UpdateSkillDto dto);
    
    SkillDto delete(Long id);
}
