package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterExperienceDto;
import com.mtx.argservr.dto.response.ExperienceDto;
import com.mtx.argservr.mapper.ExperienceMapper;
import com.mtx.argservr.model.Experience;
import com.mtx.argservr.repository.ExperienceRepository;
import com.mtx.argservr.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ExperienceServiceImpl implements IExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Autowired
    private ExperienceMapper experienceMapper;

    @Override
    public ExperienceDto save(RegisterExperienceDto dto) {
        Experience experience = experienceMapper.toExperience(dto);
        Experience saved = experienceRepository.save(experience);
        return experienceMapper.toDto(saved);
    }

    @Override
    public List<ExperienceDto> getAll() {
        return experienceMapper.toDtoList(experienceRepository.findAll());
    }

}
