package com.mtx.argservr.service;

import com.mtx.argservr.dto.request.RegisterLanguageDto;
import com.mtx.argservr.dto.request.UpdateLanguageDto;
import com.mtx.argservr.dto.response.LanguageDto;
import java.util.List;

public interface ILanguageService {

    LanguageDto save(RegisterLanguageDto dto);

    List<LanguageDto> getAll();

    LanguageDto update(Long id, UpdateLanguageDto dto);
}
