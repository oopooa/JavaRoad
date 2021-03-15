package com.opoa.designpattern.singleton;

/**
 * @program: JavaRoad->Singleton3
 * @description: 懒汉式 (线程安全)
 * @author: opoa
 * @create: 2021-03-14 22:16
 **/
public class Singleton3 {

    private Singleton3() {}

    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance() {
        if (null == instance) {
            instance = new Singleton3();
        }
        return instance;
    }

}
