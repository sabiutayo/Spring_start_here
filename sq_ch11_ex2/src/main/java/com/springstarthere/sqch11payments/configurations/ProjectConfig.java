package com.springstarthere.sqch11payments.configurations;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan
public class ProjectConfig {
    @Bean
    public RestTemplate restTemplate(){
       return new RestTemplate();
    }
}
