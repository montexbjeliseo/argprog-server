package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterSocialMediaDto;
import com.mtx.argservr.dto.request.UpdateSocialMediaDto;
import com.mtx.argservr.dto.response.SocialMediaDto;
import java.util.List;

public interface ISocialMediaService {

    SocialMediaDto save(RegisterSocialMediaDto dto);

    List<SocialMediaDto> getAll();
    
    SocialMediaDto update(Long id, UpdateSocialMediaDto dto);
}
