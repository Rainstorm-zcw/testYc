package com.example.testyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestYcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestYcApplication.class, args);
    }

}
