package com.mtx.argservr.dto.response;

import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProjectDto {

    private Long id;
    private String title;
    private String description;
    private String photo;
    private String institution;
    private String aboutInstitution;
    private Set<LinkDto> links;
    private Long indexPosition;
}
