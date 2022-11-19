package com.mtx.argservr.dto.request;

import com.mtx.argservr.util.Constants;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterExperienceDto {

    @NotBlank
    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String title;
    @NotBlank
    @Pattern(regexp = Constants.Patterns.DESCRIPTION_PATTERN)
    private String description;
    private String photo;
    @NotBlank
    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String institution;
    @NotBlank
    @Pattern(regexp = Constants.Patterns.DESCRIPTION_PATTERN)
    private String aboutInstitution;
    @NotNull
    private Long index_position;
}
