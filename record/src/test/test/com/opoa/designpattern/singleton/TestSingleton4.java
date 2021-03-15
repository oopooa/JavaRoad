package com.opoa.designpattern.singleton;

import org.junit.Test;

/**
 * @program: JavaRoad->TestSingleton4
 * @description: 测试单例模式4 双重检查锁
 * @author: opoa
 * @create: 2021-03-14 22:51
 **/
public class TestSingleton4 {

    @Test
    public void test() {

        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();

        // 比较内存地址
        System.out.println(instance == instance1);
        // 比较hashCode
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
