package com.mtx.argservr.dto.request;

import com.mtx.argservr.util.Constants;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateSkillDto {

    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String name;
    @Pattern(regexp = Constants.Patterns.TITLE_PATTERN)
    private String level;
    private String image;
}
