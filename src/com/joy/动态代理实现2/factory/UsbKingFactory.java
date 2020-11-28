package com.joy.动态代理实现2.factory;

import com.joy.动态代理实现2.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
