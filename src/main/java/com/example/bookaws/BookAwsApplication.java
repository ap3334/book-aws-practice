package com.example.bookaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class BookAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookAwsApplication.class, args);
    }

}
