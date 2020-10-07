package com.imsteam.buyserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FUNCTION：测试
 * @Author： Max
 * @Date： 2020/10/4 17:36
 */

@RestController
@RequestMapping("/test")
public class BuyTestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello, buy-server!";
    }
}
