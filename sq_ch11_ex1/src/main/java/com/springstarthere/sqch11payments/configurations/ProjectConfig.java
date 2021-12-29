package com.springstarthere.sqch11payments.configurations;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.springstarthere.sqch11payments.proxy")
public class ProjectConfig {
}
