package com.damlabin.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by francis on 12/8/20.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    /**
     * Allowing requests from certains origins
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
                .allowCredentials(true)
                .allowedHeaders("*")
                .exposedHeaders("Authorization", "Link", "X-Total-Count", "message");
    }
}
