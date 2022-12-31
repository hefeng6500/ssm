package com.yang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.yang.controller", "com.yang.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
