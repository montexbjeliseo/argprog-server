package com.mtx.argservr.dto.response;

import java.util.Calendar;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PublicResource {

    private String firstName;
    private String lastName;
    private String about;
    private String photo;
    private Calendar birthDate;
    private String email;
    private String phoneNumber;

    private List<EducationDto> educations;
    private List<ExperienceDto> experiences;
    private List<ProjectDto> projects;
    private List<SkillDto> skills;
    private List<SocialMediaDto> socialMedias;
}
