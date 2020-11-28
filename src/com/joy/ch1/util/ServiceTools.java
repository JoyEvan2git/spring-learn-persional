package com.joy.ch1.util;

import java.util.Date;

public class ServiceTools {

    public static void doLog() {
        System.out.println("方法的执行时间："+ new Date());
    }

    public static void doTrans(){
        System.out.println("执行完毕");
    }
}
