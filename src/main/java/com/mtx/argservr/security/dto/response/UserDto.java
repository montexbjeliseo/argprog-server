package com.mtx.argservr.security.dto.response;

import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String photo;
    private String email;
    private String about;
    private Date birthDate;
    private String phoneNumber;
}
