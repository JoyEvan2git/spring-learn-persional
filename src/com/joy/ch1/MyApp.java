package com.joy.ch1;

import com.joy.ch1.handler.MyInvocationHandler;
import com.joy.ch1.service.SomeService;
import com.joy.ch1.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {

//        SomeService someService = new SomeServiceImpl();
//        someService.doOther();
//        someService.doSome();

        // 使用jdk的proxy创建代理对象
        // 创建目标对象
        SomeService target = new SomeServiceImpl();

        // 创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);

        // 使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        proxy.doSome();
        proxy.doOther();
    }
}
