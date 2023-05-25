package com.example.ss6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Ss6Application {

    public static void main(String[] args) {
        SpringApplication.run(Ss6Application.class, args);
    }

}
