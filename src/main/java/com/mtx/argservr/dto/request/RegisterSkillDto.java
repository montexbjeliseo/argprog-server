package com.mtx.argservr.dto.request;

import com.mtx.argservr.util.Constants;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterSkillDto {

    @NotBlank
    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String name;
    @NotBlank
    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String level;
    private String image;
}
