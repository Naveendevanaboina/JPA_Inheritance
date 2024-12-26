package com.neoteric.japconnection.japconnection.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
    @Bean
    @Scope("singleton") // Explicit singleton scope declaration
    public ServiceA serviceA() {
        return new ServiceA();
    }

    @Bean
    @Scope("prototype") // Explicit prototype scope declaration
    public ServiceB serviceB() {
        return new ServiceB();
    }
}