package com.opoa.designpattern.singleton;

/**
 * @program: JavaRoad->Singleton4
 * @description: 双重检查锁
 * @author: opoa
 * @create: 2021-03-14 22:32
 **/
public class Singleton4 {

    private Singleton4() {}

    // volatile 对于instance 所有的写将先于读
    private static volatile Singleton4 instance;

    public static Singleton4 getInstance() {

        // 第一次检查    只在第一次创建实例的时候同步，之后不再同步
        if (null == instance) {
            synchronized (Singleton4.class) {
                // 第二次检查   确保只有一个线程能进入
                if (null == instance) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
