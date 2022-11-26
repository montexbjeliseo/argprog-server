package com.mtx.argservr.service.impl;

import com.mtx.argservr.dto.request.RegisterSocialMediaDto;
import com.mtx.argservr.dto.request.UpdateSocialMediaDto;
import com.mtx.argservr.dto.response.SocialMediaDto;
import com.mtx.argservr.exception.DuplicatedResourceException;
import com.mtx.argservr.exception.ResourceNotFoundException;
import com.mtx.argservr.mapper.SocialMediaMapper;
import com.mtx.argservr.model.SocialMedia;
import com.mtx.argservr.repository.SocialMediaRepository;
import com.mtx.argservr.service.ISocialMediaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SocialMediaServiceImpl implements ISocialMediaService {

    @Autowired
    private SocialMediaRepository socialMediaRepository;

    @Autowired
    private SocialMediaMapper socialMediaMapper;

    @Override
    public SocialMediaDto save(RegisterSocialMediaDto dto) {
        if (socialMediaRepository.existsByName(dto.getName())) {
            throw new DuplicatedResourceException("Nombre en uso");
        }
        SocialMedia socialMedia = socialMediaMapper.toSocialMedia(dto);
        SocialMedia saved = socialMediaRepository.save(socialMedia);
        return socialMediaMapper.toDto(saved);
    }

    @Override
    public List<SocialMediaDto> getAll() {
        return socialMediaMapper.toDtoList(socialMediaRepository.findAll());
    }

    @Override
    public SocialMediaDto update(Long id, UpdateSocialMediaDto dto) {
        if (!socialMediaRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        SocialMedia socialMedia = socialMediaRepository.findById(id).get();
        socialMedia = socialMediaMapper.update(dto, socialMedia);
        SocialMedia saved = socialMediaRepository.save(socialMedia);
        return socialMediaMapper.toDto(saved);
    }

    @Override
    public SocialMediaDto delete(Long id) {
        if (!socialMediaRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se encontró el recurso");
        }
        SocialMedia socialMedia = socialMediaRepository.findById(id).get();
        socialMediaRepository.deleteById(id);
        return socialMediaMapper.toDto(socialMedia);
    }
}
