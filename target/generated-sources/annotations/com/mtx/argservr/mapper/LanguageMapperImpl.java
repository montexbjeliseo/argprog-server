package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterLanguageDto;
import com.mtx.argservr.dto.request.UpdateLanguageDto;
import com.mtx.argservr.dto.response.LanguageDto;
import com.mtx.argservr.model.Language;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-23T21:35:57-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class LanguageMapperImpl implements LanguageMapper {

    @Override
    public Language toLanguage(RegisterLanguageDto dto) {
        if ( dto == null ) {
            return null;
        }

        Language language = new Language();

        return language;
    }

    @Override
    public LanguageDto toDto(Language language) {
        if ( language == null ) {
            return null;
        }

        LanguageDto languageDto = new LanguageDto();

        return languageDto;
    }

    @Override
    public List<LanguageDto> toDtoList(List<Language> list) {
        if ( list == null ) {
            return null;
        }

        List<LanguageDto> list1 = new ArrayList<LanguageDto>( list.size() );
        for ( Language language : list ) {
            list1.add( toDto( language ) );
        }

        return list1;
    }

    @Override
    public Language update(UpdateLanguageDto dto, Language language) {
        if ( dto == null ) {
            return null;
        }

        return language;
    }
}
