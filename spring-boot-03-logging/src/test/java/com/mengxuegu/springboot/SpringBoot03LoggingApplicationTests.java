package com.mengxuegu.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot03LoggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        logger.trace("这是trace日志信息");
        logger.debug("这是debug日志信息");
        logger.info("这是 info 日志信息");
        logger.warn("这是 warn 日志信息");
        logger.error("这是 error 日志信息");
    }

}
