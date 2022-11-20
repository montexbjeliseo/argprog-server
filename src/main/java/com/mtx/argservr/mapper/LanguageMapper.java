package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterLanguageDto;
import com.mtx.argservr.dto.request.UpdateLanguageDto;
import com.mtx.argservr.dto.response.LanguageDto;
import com.mtx.argservr.model.Language;
import java.util.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface LanguageMapper {

    Language toLanguage(RegisterLanguageDto dto);

    LanguageDto toDto(Language language);

    List<LanguageDto> toDtoList(List<Language> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Language update(UpdateLanguageDto dto, @MappingTarget Language language);
}
