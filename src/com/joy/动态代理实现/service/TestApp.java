package com.joy.动态代理实现.service;

import com.joy.动态代理实现.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloService helloService = new HelloServiceImpl();
        // 通过反射执行方法
        Method method = HelloService.class.getMethod("sayHello", String.class);
        // method可以执行sayHello方法
        /**
         * invoke是method最重要的方法，表示执行方法的调用
         * 参数：
         * 1. Object, 表示该对象
         * 2. Object args, 方法执行时的参数值
         * 返回值：
         * Object: 方法执行后的返回值
         */
        method.invoke(helloService, "zhangsan");
    }
}
