package com.linjing.testserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServerApplication.class, args);
    }

}

