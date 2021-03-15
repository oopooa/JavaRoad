package com.opoa.designpattern.singleton;

/**
 * @program: JavaRoad->Singleton1
 * @description: 饿汉式
 * @author: opoa
 * @create: 2021-03-14 20:29
 **/

/**
 * 饿汉式
 */
public class Singleton1 {

    /**
     * 私有化构造方法
     */
    private Singleton1() {}

    /**
     * 在类的内部创建好实例。【静态变量的目的是为了类加载的时候创建实例】
     */
    private final static Singleton1 instance = new Singleton1();

    /**
     * 向外提供一个公有的静态方法，返回该唯一实例。
     * @return 实例
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
