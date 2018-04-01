package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@Configuration
@SpringBootApplication
public class QuizMainServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizMainServiceApplication.class, args);
    }
}
