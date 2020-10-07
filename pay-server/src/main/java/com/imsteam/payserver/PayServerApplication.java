package com.imsteam.payserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient   //开启Eureka服务
@SpringBootApplication
public class PayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayServerApplication.class, args);
    }

}
