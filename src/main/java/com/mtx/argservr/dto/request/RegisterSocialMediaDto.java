package com.mtx.argservr.dto.request;

import com.mtx.argservr.util.Constants.Patterns;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
@NoArgsConstructor
public class RegisterSocialMediaDto {

    @NotBlank
    @Pattern(regexp = Patterns.TITLE_PATTERN)
    private String name;
    private String image;
    @NotBlank
    @URL
    private String link;
}
