package com.epam.sergeev.rest_api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Sea
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.epam.sergeev.rest_api")
public class BeanConfig implements WebMvcConfigurer {

    public static final String CHARACTER_ENCODING = "UTF-8";

    public BeanConfig() {
        super();
    }
}
