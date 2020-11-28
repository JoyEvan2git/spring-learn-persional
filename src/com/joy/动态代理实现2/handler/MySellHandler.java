package com.joy.动态代理实现2.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MySellHandler implements InvocationHandler {

    private Object target;

    // 传入是谁就给谁代理
    public MySellHandler(Object target) {
        // 给目标对象赋值
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        // 执行目标方法
        res = method.invoke(target, args);

        if (res != null) {
            Float price = (Float) res;
            price = price + 25;
            res = price;
        }

        System.out.println("淘宝商家，返回红包");

        return res;
    }
}
