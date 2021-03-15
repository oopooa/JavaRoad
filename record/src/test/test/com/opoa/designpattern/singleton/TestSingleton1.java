package com.opoa.designpattern.singleton;

import org.junit.Test;

/**
 * @program: JavaRoad->TestSingleton1
 * @description: 测试单例模式1 饿汉式
 * @author: opoa
 * @create: 2021-03-14 20:33
 **/
public class TestSingleton1 {

    @Test
    public void test() {

        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();

        // 比较内存地址
        System.out.println(instance == instance1);
        // 比较hashCode
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
