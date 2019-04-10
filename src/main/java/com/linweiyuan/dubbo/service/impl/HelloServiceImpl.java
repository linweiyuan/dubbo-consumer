package com.linweiyuan.dubbo.service.impl;

import com.linweiyuan.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello -> " + name;
    }
}