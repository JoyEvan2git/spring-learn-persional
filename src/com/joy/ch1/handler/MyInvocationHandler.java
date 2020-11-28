package com.joy.ch1.handler;

import com.joy.ch1.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    // 目标对象,SomeServiceImpl类
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        // 通过代理对象执行方法时，会调用执行这个invoke()
        // 执行目标类的方法，通过Method类实现
        ServiceTools.doLog();
        res = method.invoke(object, args);
        ServiceTools.doTrans();
        // 返回目标方法执行结果
        return res;
    }
}
