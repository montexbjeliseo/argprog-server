package com.mtx.argservr.security.mapper;

import com.mtx.argservr.security.dto.request.RegisterUserDto;
import com.mtx.argservr.security.dto.request.UpdateUserDto;
import com.mtx.argservr.security.dto.response.RegisteredUserDto;
import com.mtx.argservr.security.dto.response.UserDto;
import com.mtx.argservr.security.model.User;
import java.sql.Date;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-23T21:36:03-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(RegisterUserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setAbout( dto.getAbout() );
        user.setBirthDate( dto.getBirthDate() );
        user.setEmail( dto.getEmail() );
        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setPassword( dto.getPassword() );
        user.setPhoto( dto.getPhoto() );

        return user;
    }

    @Override
    public RegisteredUserDto toRegisteredDto(User user) {
        if ( user == null ) {
            return null;
        }

        RegisteredUserDto registeredUserDto = new RegisteredUserDto();

        registeredUserDto.setAbout( user.getAbout() );
        registeredUserDto.setEmail( user.getEmail() );
        registeredUserDto.setFirstName( user.getFirstName() );
        registeredUserDto.setLastName( user.getLastName() );
        registeredUserDto.setPhoto( user.getPhoto() );

        return registeredUserDto;
    }

    @Override
    public User update(UpdateUserDto dto, User user) {
        if ( dto == null ) {
            return null;
        }

        if ( dto.getAbout() != null ) {
            user.setAbout( dto.getAbout() );
        }
        if ( dto.getBirthDate() != null ) {
            user.setBirthDate( new Date( dto.getBirthDate().getTime() ) );
        }
        if ( dto.getEmail() != null ) {
            user.setEmail( dto.getEmail() );
        }
        if ( dto.getFirstName() != null ) {
            user.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            user.setLastName( dto.getLastName() );
        }
        if ( dto.getPassword() != null ) {
            user.setPassword( dto.getPassword() );
        }
        if ( dto.getPhoneNumber() != null ) {
            user.setPhoneNumber( dto.getPhoneNumber() );
        }
        if ( dto.getPhoto() != null ) {
            user.setPhoto( dto.getPhoto() );
        }

        return user;
    }

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setAbout( user.getAbout() );
        userDto.setBirthDate( user.getBirthDate() );
        userDto.setEmail( user.getEmail() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setPhoneNumber( user.getPhoneNumber() );
        userDto.setPhoto( user.getPhoto() );

        return userDto;
    }
}
