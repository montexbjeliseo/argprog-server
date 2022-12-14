package com.mtx.argservr.dto.request;

import com.mtx.argservr.util.Constants;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateExperienceDto {

    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String title;
    @Pattern(regexp = Constants.Patterns.DESCRIPTION_PATTERN)
    private String description;
    private String photo;
    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String institution;
    @Pattern(regexp = Constants.Patterns.DESCRIPTION_PATTERN)
    private String aboutInstitution;
    private Long indexPosition;
}
