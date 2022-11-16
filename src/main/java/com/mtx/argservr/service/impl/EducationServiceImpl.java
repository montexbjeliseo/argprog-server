package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterEducationDto;
import com.mtx.argservr.dto.response.EducationDto;
import com.mtx.argservr.mapper.EducationMapper;
import com.mtx.argservr.model.Education;
import com.mtx.argservr.repository.EducationRepository;
import com.mtx.argservr.service.IEducationService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducationServiceImpl implements IEducationService {

    @Autowired
    private EducationRepository educationRepository;

    @Autowired
    private EducationMapper educationMapper;

    @Override
    public EducationDto save(RegisterEducationDto dto) {
        Education education = educationMapper.toEducation(dto);
        Education saved = educationRepository.save(education);
        return educationMapper.toDto(saved);
    }

    @Override
    public List<EducationDto> getAll() {
        return educationMapper.toDtoList(educationRepository.findAll());
    }

}
