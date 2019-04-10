package com.linweiyuan.dubbo.controller;

import com.linweiyuan.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name) {
        return helloService.hello(name);
    }
}