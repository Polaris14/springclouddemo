package com.huy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderTwo {
    public static void main(String[] args) {
        SpringApplication.run(ProviderTwo.class,args);
    }
}
