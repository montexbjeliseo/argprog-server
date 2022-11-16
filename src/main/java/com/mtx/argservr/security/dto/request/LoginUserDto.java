package com.mtx.argservr.security.dto.request;

import com.mtx.argservr.util.Constants.Patterns;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

@Data
public class LoginUserDto {

    @NotBlank
    @Email
    private String username;
    @NotBlank
    @Pattern(regexp = Patterns.PASSWORD_PATTERN)
    private String password;
}
