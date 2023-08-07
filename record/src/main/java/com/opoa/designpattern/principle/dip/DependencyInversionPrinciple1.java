package com.opoa.designpattern.principle.dip;


/**
 * @description: 依赖倒转原则
 * @author: opoa
 * @create: 2023-08-08 00:53
 **/
public class DependencyInversionPrinciple1 {

    public static void main(String[] args) {
        Mother1 mother = new Mother1();
        mother.read(new Book1());
    }

}

class Book1 {

    public String getContent() {
        return "这是一个有趣的故事";
    }

}

class Newspaper1 {

    public String getContent() {
        return "这是一个重要的新闻";
    }

}

class Mother1 {

    public void read(Book1 book) {
        System.out.println("妈妈开始讲故事");
        System.out.println(book.getContent());
    }

}