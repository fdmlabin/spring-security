package com.damlabin.springsecurity.config;


import com.damlabin.springsecurity.aop.LoggingAspect;
import com.damlabin.springsecurity.utils.ConstantsUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfiguration {

    @Bean
    @Profile(ConstantsUtils.SPRING_PROFILE_DEVELOPMENT)
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }
}
