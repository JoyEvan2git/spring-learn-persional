package com.joy.动态代理实现.service.impl;

import com.joy.动态代理实现.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
