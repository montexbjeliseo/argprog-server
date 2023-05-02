package com.mtx.argservr.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author montexbjeliseo
 */
@Getter
@Setter
@NoArgsConstructor
public class LinkDto {

    private Long id;
    private String name;
    private String url;
}
