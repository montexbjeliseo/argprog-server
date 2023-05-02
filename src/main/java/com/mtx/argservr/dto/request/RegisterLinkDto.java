package com.mtx.argservr.dto.request;

import com.mtx.argservr.util.Constants.Patterns;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

/**
 *
 * @author montexbjeliseo
 */
@Getter
@Setter
@NoArgsConstructor
public class RegisterLinkDto {

    @NotBlank
    @Pattern(regexp = Patterns.TITLE_PATTERN)
    private String name;
    
    @NotBlank
    @URL
    private String url;
}
