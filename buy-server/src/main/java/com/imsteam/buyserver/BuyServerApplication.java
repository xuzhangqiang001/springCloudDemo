package com.imsteam.buyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient  //开启Eureka服务
@SpringBootApplication
public class BuyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyServerApplication.class, args);
    }

}
