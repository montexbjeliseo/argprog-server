package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterLanguageDto;
import com.mtx.argservr.dto.request.UpdateLanguageDto;
import com.mtx.argservr.dto.response.ExperienceDto;
import com.mtx.argservr.dto.response.LanguageDto;
import com.mtx.argservr.exception.DuplicatedResourceException;
import com.mtx.argservr.exception.ResourceNotFoundException;
import com.mtx.argservr.mapper.LanguageMapper;
import com.mtx.argservr.model.Experience;
import com.mtx.argservr.model.Language;
import com.mtx.argservr.repository.LanguageRepository;
import com.mtx.argservr.service.ILanguageService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LanguageServiceImpl implements ILanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    @Autowired
    private LanguageMapper languageMapper;

    @Override
    public LanguageDto save(RegisterLanguageDto dto) {
        if (languageRepository.existsByName(dto.getName())) {
            throw new DuplicatedResourceException("El nombre ya se encuentra en uso");
        }
        Language language = languageMapper.toLanguage(dto);
        Language saved = languageRepository.save(language);
        return languageMapper.toDto(saved);
    }

    @Override
    public List<LanguageDto> getAll() {
        return languageMapper.toDtoList(languageRepository.findAll());
    }

    @Override
    public LanguageDto update(Long id, UpdateLanguageDto dto) {
        if (!languageRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró");
        }
        Language language = languageRepository.getById(id);
        language = languageMapper.update(dto, language);
        Language saved = languageRepository.save(language);
        return languageMapper.toDto(saved);
    }

    @Override
    public LanguageDto delete(Long id) {
        if (!languageRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        Language language = languageRepository.findById(id).get();
        languageRepository.deleteById(id);
        return languageMapper.toDto(language);
    }

}
