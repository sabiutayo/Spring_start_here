package com.springstarthere.sqch11payments.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ComponentScan(basePackages = ("com/springstarthere/sqch11payments/proxy"))
public class ProjectConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
}
