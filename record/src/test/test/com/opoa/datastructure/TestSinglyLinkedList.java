package com.opoa.datastructure;

import org.junit.Test;

/**
 * @program: JavaRoad->TestSinglyLinkedList
 * @description: 测试自定义单链表
 * @author: opoa
 * @create: 2021-03-11 20:40
 **/
public class TestSinglyLinkedList {

    @Test
    public void test() {
        // 初始化一个单链表
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertFirst("2");
        linkedList.insert(0, "1");
        linkedList.insert(0, "0");
        linkedList.insert(0, "2");
        linkedList.insertLast("5");
        System.out.println(linkedList);
        SinglyLinkedList<String>.Node remove = linkedList.remove("5");
        System.out.println("删除: " + remove);
        System.out.println(linkedList);
        System.out.println("寻找值为8的字符串 结果: " + linkedList.getNode("8"));
        System.out.println("单链表的长度: " + linkedList.length());
    }
}
