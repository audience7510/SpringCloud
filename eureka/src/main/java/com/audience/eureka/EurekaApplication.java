package com.audience.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    private final static Logger logger= LoggerFactory.getLogger(EurekaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        logger.info("*****Eureka服务启动成功*****");
    }
}
