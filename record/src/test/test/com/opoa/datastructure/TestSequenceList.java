package com.opoa.datastructure;

import org.junit.Test;

/**
 * @program: JavaRoad->TestSequenceList
 * @description: 测试自定义顺序表
 * @author: opoa
 * @create: 2021-03-11 20:39
 **/
public class TestSequenceList {

    @Test
    public void test() {
        SequenceList list = new SequenceList();
        list.insert("1");
        list.insert("2");
        list.insert("3");
        list.insert("4");
        list.insert("6");
        System.out.println("初始化");
        System.out.println(list);
        System.out.println("插入一个元素");
        list.insert(4,"5");
        System.out.println(list);
        System.out.println("删除一个元素");
        String remove = list.remove(5);
        System.out.println("删除的元素: " + remove);
        System.out.println(list);
        System.out.println(list.getLength());
        System.out.println(list.getCapacity());
        System.out.println("当前数组最大容量: " + list.getCapacity());
        list.enlarge();
        System.out.println("当前数组最大容量: " + list.getCapacity());
        System.out.println(list);
        System.out.println(list.getLength());
    }

}
