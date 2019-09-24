package com.example.testyc;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestYcApplicationTests {

    private Logger logger = LoggerFactory.getLogger(TestYcApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("测试");
    }

}
