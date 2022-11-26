package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterExperienceDto;
import com.mtx.argservr.dto.request.UpdateExperienceDto;
import com.mtx.argservr.dto.response.EducationDto;
import com.mtx.argservr.dto.response.ExperienceDto;
import com.mtx.argservr.exception.ResourceNotFoundException;
import com.mtx.argservr.mapper.ExperienceMapper;
import com.mtx.argservr.model.Education;
import com.mtx.argservr.model.Experience;
import com.mtx.argservr.repository.ExperienceRepository;
import com.mtx.argservr.service.IExperienceService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
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

    @Override
    public ExperienceDto update(Long id, UpdateExperienceDto dto) {
        if (!experienceRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        Experience experience = experienceRepository.findById(id).get();
        experience = experienceMapper.update(dto, experience);
        Experience saved = experienceRepository.save(experience);
        return experienceMapper.toDto(saved);
    }

    @Override
    public ExperienceDto delete(Long id) {
        if (!experienceRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        Experience experience = experienceRepository.findById(id).get();
        experienceRepository.deleteById(id);
        return experienceMapper.toDto(experience);
    }

}
