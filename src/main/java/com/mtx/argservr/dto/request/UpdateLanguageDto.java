package com.mtx.argservr.dto.request;

import com.mtx.argservr.util.Constants.Patterns;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateLanguageDto {

    @Pattern(regexp = Patterns.TITLE_PATTERN)
    private String name;
    @Pattern(regexp = Patterns.DESCRIPTION_PATTERN)
    private String description;
}
