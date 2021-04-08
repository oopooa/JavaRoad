package com.opoa.datastructure;

import org.junit.Test;


/**
 * @program: JavaRoad->TestDoubleLinkedList
 * @description: 测试自定义双链表
 * @author: opoa
 * @create: 2021-04-07 15:49
 **/
public class TestDoubleLinkedList {

    @Test
    public void test() {

        // 初始化一个双链表
        System.out.println("初始化双链表:");
        DoubleLinkedList<String> linkedList = new DoubleLinkedList<>();
        linkedList.add("0");
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println(linkedList);
        System.out.println("在链表下标为3的位置插入元素32");
        linkedList.insert("32", 3);
        System.out.println(linkedList);
        System.out.println("修改链表下标为0的位置值为start");
        linkedList.set(0, "start");
        System.out.println(linkedList);
        System.out.println("删除数据为1的结点");
        linkedList.remove("1");
        System.out.println(linkedList);
        System.out.println("删除下标为2的结点");
        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println("链表的长度为: " + linkedList.length());

    }
}
