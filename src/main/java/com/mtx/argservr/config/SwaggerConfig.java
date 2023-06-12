package com.mtx.argservr.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {

        List<Predicate<RequestHandler>> predicateList = new ArrayList<>();
        predicateList.add(RequestHandlerSelectors.basePackage("com.mtx.argservr.controller"));
        predicateList.add(RequestHandlerSelectors.basePackage("com.mtx.argservr.security.controller"));

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(Predicates.or(predicateList))
                .paths(PathSelectors.any())
                .build();
    }
}