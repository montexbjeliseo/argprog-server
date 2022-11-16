package com.mtx.argservr.security.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisteredUserDto {

    private String firstName;
    private String lastName;
    private String email;
    private String jwtToken;
}
