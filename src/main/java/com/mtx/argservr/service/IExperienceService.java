package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterExperienceDto;
import com.mtx.argservr.dto.response.ExperienceDto;
import java.util.List;

public interface IExperienceService {

    ExperienceDto save(RegisterExperienceDto dto);

    List<ExperienceDto> getAll();
}
