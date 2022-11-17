package com.mycompany.property.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static ch.qos.logback.classic.spi.ThrowableProxyVO.build;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {



    @Bean
    public Docket appApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2).
                select().apis(RequestHandlerSelectors.basePackage("com.mycompany.property.management"))
                .paths(PathSelectors.regex("/.")).build();
return docket;
    }

}
