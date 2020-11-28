package com.joy.动态代理实现2;

import com.joy.动态代理实现2.factory.UsbKingFactory;
import com.joy.动态代理实现2.handler.MySellHandler;
import com.joy.动态代理实现2.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {

    public static void main(String[] args) {
        // 创建目标对象
        UsbSell factory = new UsbKingFactory();

        // 创建InvocationHandler对象
        InvocationHandler handler = new MySellHandler(factory);

        // 创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);

        float price = proxy.sell(1);
        System.out.println(price);
    }
}
