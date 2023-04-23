package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.request.RegisterSocialMediaDto;
import com.mtx.argservr.dto.request.UpdateSocialMediaDto;
import com.mtx.argservr.dto.response.SocialMediaDto;
import com.mtx.argservr.model.SocialMedia;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-23T19:11:27-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.19 (Microsoft)"
)
@Component
public class SocialMediaMapperImpl implements SocialMediaMapper {

    @Override
    public SocialMedia toSocialMedia(RegisterSocialMediaDto dto) {
        if ( dto == null ) {
            return null;
        }

        SocialMedia socialMedia = new SocialMedia();

        socialMedia.setName( dto.getName() );
        socialMedia.setImage( dto.getImage() );
        socialMedia.setLink( dto.getLink() );

        return socialMedia;
    }

    @Override
    public SocialMediaDto toDto(SocialMedia socialMedia) {
        if ( socialMedia == null ) {
            return null;
        }

        SocialMediaDto socialMediaDto = new SocialMediaDto();

        socialMediaDto.setId( socialMedia.getId() );
        socialMediaDto.setName( socialMedia.getName() );
        socialMediaDto.setImage( socialMedia.getImage() );
        socialMediaDto.setLink( socialMedia.getLink() );

        return socialMediaDto;
    }

    @Override
    public List<SocialMediaDto> toDtoList(List<SocialMedia> list) {
        if ( list == null ) {
            return null;
        }

        List<SocialMediaDto> list1 = new ArrayList<SocialMediaDto>( list.size() );
        for ( SocialMedia socialMedia : list ) {
            list1.add( toDto( socialMedia ) );
        }

        return list1;
    }

    @Override
    public SocialMedia update(UpdateSocialMediaDto dto, SocialMedia socialMedia) {
        if ( dto == null ) {
            return null;
        }

        if ( dto.getName() != null ) {
            socialMedia.setName( dto.getName() );
        }
        if ( dto.getImage() != null ) {
            socialMedia.setImage( dto.getImage() );
        }
        if ( dto.getLink() != null ) {
            socialMedia.setLink( dto.getLink() );
        }

        return socialMedia;
    }
}
