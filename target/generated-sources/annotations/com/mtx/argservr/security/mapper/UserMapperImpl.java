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
    date = "2023-03-29T18:19:20-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(RegisterUserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setEmail( dto.getEmail() );
        user.setPassword( dto.getPassword() );
        user.setPhoto( dto.getPhoto() );
        user.setAbout( dto.getAbout() );
        user.setBirthDate( dto.getBirthDate() );

        return user;
    }

    @Override
    public RegisteredUserDto toRegisteredDto(User user) {
        if ( user == null ) {
            return null;
        }

        RegisteredUserDto registeredUserDto = new RegisteredUserDto();

        registeredUserDto.setFirstName( user.getFirstName() );
        registeredUserDto.setLastName( user.getLastName() );
        registeredUserDto.setPhoto( user.getPhoto() );
        registeredUserDto.setEmail( user.getEmail() );
        registeredUserDto.setAbout( user.getAbout() );

        return registeredUserDto;
    }

    @Override
    public User update(UpdateUserDto dto, User user) {
        if ( dto == null ) {
            return null;
        }

        if ( dto.getFirstName() != null ) {
            user.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            user.setLastName( dto.getLastName() );
        }
        if ( dto.getEmail() != null ) {
            user.setEmail( dto.getEmail() );
        }
        if ( dto.getPassword() != null ) {
            user.setPassword( dto.getPassword() );
        }
        if ( dto.getPhoto() != null ) {
            user.setPhoto( dto.getPhoto() );
        }
        if ( dto.getAbout() != null ) {
            user.setAbout( dto.getAbout() );
        }
        if ( dto.getBirthDate() != null ) {
            user.setBirthDate( new Date( dto.getBirthDate().getTime() ) );
        }
        if ( dto.getPhoneNumber() != null ) {
            user.setPhoneNumber( dto.getPhoneNumber() );
        }

        return user;
    }

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setPhoto( user.getPhoto() );
        userDto.setEmail( user.getEmail() );
        userDto.setAbout( user.getAbout() );
        userDto.setBirthDate( user.getBirthDate() );
        userDto.setPhoneNumber( user.getPhoneNumber() );

        return userDto;
    }
}
