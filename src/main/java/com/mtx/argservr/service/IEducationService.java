package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterEducationDto;
import com.mtx.argservr.dto.response.EducationDto;
import java.util.List;

public interface IEducationService {

    EducationDto save(RegisterEducationDto dto);

    List<EducationDto> getAll();
}
