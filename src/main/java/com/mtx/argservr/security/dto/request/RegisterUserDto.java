package com.mtx.argservr.security.dto.request;

import com.mtx.argservr.util.Constants.Patterns;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

@Getter
@Setter
@NoArgsConstructor
public class RegisterUserDto {

    @NotBlank
    @Pattern(regexp = Patterns.FIRSTNAME_PATTERN)
    private String firstName;

    @NotBlank
    @Pattern(regexp = Patterns.LASTNAME_PATTERN)
    private String lastName;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = Patterns.PASSWORD_PATTERN)
    private String password;
}
