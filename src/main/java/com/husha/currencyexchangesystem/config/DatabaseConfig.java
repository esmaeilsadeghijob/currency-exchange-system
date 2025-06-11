package com.husha.currencyexchangesystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.husha.currencyexchangesystem.repository")
public class DatabaseConfig {
}
