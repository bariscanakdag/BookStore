package com.bookstore.config.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "WEB-INF/spring-security.xml")
public class WebSecurityConfig {
    public WebSecurityConfig(){
        super();
    }
}
