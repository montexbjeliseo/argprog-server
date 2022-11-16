package com.mtx.argservr.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterEducationDto {

    private String title;
    private String description;
    private String institution;
    private String aboutInstitution;
    private Long index_position;
}
