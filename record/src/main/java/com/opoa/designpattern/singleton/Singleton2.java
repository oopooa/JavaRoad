package com.opoa.designpattern.singleton;

/**
 * @program: JavaRoad->Singleton2
 * @description: 懒汉式 （非线程安全）
 * @author: opoa
 * @create: 2021-03-14 22:01
 **/
public class Singleton2 {

    private Singleton2() {}

    private static Singleton2 instance;

    public static Singleton2 getInstance() {

        // 如果实例为空 则初始化一个赋给instance
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
}
