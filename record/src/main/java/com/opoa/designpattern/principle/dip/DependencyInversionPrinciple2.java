package com.opoa.designpattern.principle.dip;

/**
 * @description: 依赖倒转原则
 * @author: opoa
 * @create: 2023-08-08 01:06
 **/
public class DependencyInversionPrinciple2 {

    public static void main(String[] args) {
        Mother2 mother = new Mother2();

        mother.read(new Book2());
        mother.read(new Newspaper2());
    }

}

interface IRead {

    public String getContent();

}

class Book2 implements IRead {

    @Override
    public String getContent() {
        return "这是一个有趣的故事";
    }

}

class Newspaper2 implements IRead {

    @Override
    public String getContent() {
        return "这是一则重要的新闻";
    }

}

class Mother2 {

    public void read(IRead read) {
        System.out.println("妈妈开始讲故事");
        System.out.println(read.getContent());
    }

}
