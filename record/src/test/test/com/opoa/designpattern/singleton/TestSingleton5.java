package com.opoa.designpattern.singleton;

import org.junit.Test;

/**
 * @program: JavaRoad->TestSingleton5
 * @description: 测试单例模式5 枚举类
 * @author: opoa
 * @create: 2021-03-15 20:11
 **/
public class TestSingleton5 {

    @Test
    public void test() {

        Singleton5 instance = Singleton5.INSTANCE;
        Singleton5 instance1 = Singleton5.INSTANCE;

        // 比较内存地址
        System.out.println(instance == instance1);
        // 比较hashCode
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

        instance.doSomething();
    }
}
