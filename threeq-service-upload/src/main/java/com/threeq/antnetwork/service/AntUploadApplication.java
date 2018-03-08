package com.threeq.antnetwork.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AntUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntUploadApplication.class);
    }
}
