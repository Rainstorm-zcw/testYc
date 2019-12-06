package com.example.testyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})*/
@SpringBootApplication
@MapperScan(basePackages = {"com.example.testyc"})
public class TestYcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestYcApplication.class, args);
    }

}
