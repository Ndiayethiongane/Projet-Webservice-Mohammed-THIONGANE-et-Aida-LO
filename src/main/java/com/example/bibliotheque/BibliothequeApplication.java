package com.example.bibliotheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.bibliotheque.repository")
public class BibliothequeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliothequeApplication.class, args);
    }
}
