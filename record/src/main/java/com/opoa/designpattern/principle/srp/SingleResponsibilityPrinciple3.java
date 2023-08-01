package com.opoa.designpattern.principle.srp;

/**
 * @description: 单一职责原则
 * @author: opoa
 * @create: 2023-08-01 23:02
 **/
public class SingleResponsibilityPrinciple3 {

    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
        animal.breathe("鱼");
    }

}

class Animal2 {
    public void breathe(String animal) {
        if ("鱼".equals(animal)) {
            System.out.println(animal + "呼吸水");
        } else {
            System.out.println(animal + "呼吸空气");
        }
    }
}
