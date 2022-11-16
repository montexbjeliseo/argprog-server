package com.mtx.argservr.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExperienceDto {

    private Long id;
    private String title;
    private String description;
    private String institution;
    private String aboutInstitution;
    private Long index_position;
}
