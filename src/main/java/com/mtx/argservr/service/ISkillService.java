package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterSkillDto;
import com.mtx.argservr.dto.response.SkillDto;
import java.util.List;

public interface ISkillService {

    SkillDto save(RegisterSkillDto dto);

    List<SkillDto> getAll();
}
