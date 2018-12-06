package com.audience.company;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(basePackages ="com.audience.company.mapper.**")
public class CompanyApplication {
    private final static Logger logger= LoggerFactory.getLogger(CompanyApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
        System.out.println("*****company服务启动成功*****");
    }
}
