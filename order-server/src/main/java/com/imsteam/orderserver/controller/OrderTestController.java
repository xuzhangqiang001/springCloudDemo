package com.imsteam.orderserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FUNCTION： 测试
 * @Author： Max
 * @Date： 2020/10/4 17:44
 */

@RestController
@RequestMapping("/test")
public class OrderTestController {

    @PostMapping("/hello")
    public String hello() {
        return "hello, order-server!";
    }
}