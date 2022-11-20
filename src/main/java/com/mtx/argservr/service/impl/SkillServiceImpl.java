package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterSkillDto;
import com.mtx.argservr.dto.request.UpdateSkillDto;
import com.mtx.argservr.dto.response.SkillDto;
import com.mtx.argservr.exception.DuplicatedResourceException;
import com.mtx.argservr.exception.ResourceNotFoundException;
import com.mtx.argservr.mapper.SkillMapper;
import com.mtx.argservr.model.Skill;
import com.mtx.argservr.repository.SkillRepository;
import com.mtx.argservr.service.ISkillService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillServiceImpl implements ISkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private SkillMapper skillMapper;

    @Override
    public SkillDto save(RegisterSkillDto dto) {
        if (skillRepository.existsByName(dto.getName())) {
            throw new DuplicatedResourceException("Ya existe una habilidad con ese nombre");
        }
        Skill skill = skillMapper.toSkill(dto);
        Skill saved = skillRepository.save(skill);
        return skillMapper.toDto(saved);
    }

    @Override
    public List<SkillDto> getAll() {
        return skillMapper.toDtoList(skillRepository.findAll());
    }

    @Override
    public SkillDto update(Long id, UpdateSkillDto dto) {
        if (!skillRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        Skill skill = skillRepository.findById(id).get();
        skill = skillMapper.update(dto, skill);
        Skill saved = skillRepository.save(skill);
        return skillMapper.toDto(saved);
    }

}
