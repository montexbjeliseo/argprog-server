package com.mtx.argservr.security.dto.request;

import com.mtx.argservr.util.Constants.Patterns;
import java.util.Date;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
@NoArgsConstructor
public class UpdateUserDto {

    @Pattern(regexp = Patterns.FIRSTNAME_PATTERN)
    private String firstName;

    @Pattern(regexp = Patterns.LASTNAME_PATTERN)
    private String lastName;

    @Email
    private String email;

    @Pattern(regexp = Patterns.PASSWORD_PATTERN)
    private String password;

    @URL
    private String photo;
    @Pattern(regexp = Patterns.DESCRIPTION_PATTERN)
    private String about;
    
    private Date birthDate;
    
    private String phoneNumber;
}
