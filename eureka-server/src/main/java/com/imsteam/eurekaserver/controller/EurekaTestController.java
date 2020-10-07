package com.imsteam.eurekaserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FUNCTION：测试
 * @Author： Max
 * @Date： 2020/10/4 18:32
 */

@RestController
@RequestMapping("/test")
public class EurekaTestController {

    @PostMapping("/hello")
    public String hello(){
        return "hello, Eureka-server!";
    }
}
