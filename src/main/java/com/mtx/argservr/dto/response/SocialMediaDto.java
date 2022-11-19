package com.mtx.argservr.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SocialMediaDto {

    private Long id;
    private String name;
    private String image;
    private String link;
}
