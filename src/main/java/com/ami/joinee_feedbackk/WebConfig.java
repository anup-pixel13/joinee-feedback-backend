package com.ami.joinee_feedbackk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Apply to all endpoints
                        .allowedOrigins("http://localhost:3000") // Allow React dev server
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD") // Allow common methods including OPTIONS
                        .allowedHeaders("*") // Allow all headers
                        .exposedHeaders("*") // Expose all headers
                        .allowCredentials(true) // Allow credentials
                        .maxAge(3600); // Cache preflight response for 1 hour
            }
        };
    }
}