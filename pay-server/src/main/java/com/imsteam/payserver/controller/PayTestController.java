package com.imsteam.payserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FUNCTION： 测试
 * @Author： Max
 * @Date： 2020/10/4 17:53
 */

@RequestMapping("/test")
@RestController
public class PayTestController {

    @PostMapping("/hello")
    public String hello(){
        return "hello, pay-server!";
    }
}
