package com.mtx.argservr.dto.response;

import lombok.Data;

@Data
public class EducationDto {

    private Long id;
    private String title;
    private String description;
    private String institution;
    private String aboutInstitution;
    private Long index_position;
}
