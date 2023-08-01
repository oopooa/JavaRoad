package com.opoa.designpattern.principle.srp;

/**
 * @description: 单一职责原则
 * @author: opoa
 * @create: 2023-08-01 23:05
 **/
public class SingleResponsibilityPrinciple4 {

    public static void main(String[] args) {
        Animal3 animal = new Animal3();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
        animal.breathe2("鱼");
    }

}

class Animal3 {

    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }

    public void breathe2(String animal) {
        System.out.println(animal + "呼吸水");
    }

}
