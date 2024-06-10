package com.pasindu.pizza_creed.service;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface LoginService {
    @Bean
    BCryptPasswordEncoder passwordEncoder();
}
