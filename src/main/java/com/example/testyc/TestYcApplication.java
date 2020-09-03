package com.example.testyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

/*@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})*/
@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = {"com.example.testyc.persistence.mapper"})
public class TestYcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestYcApplication.class, args);
    }

}
