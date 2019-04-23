package com.tecnotree.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringJpaOracleDemoApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaOracleDemoApplication.class, args);
    }
}
