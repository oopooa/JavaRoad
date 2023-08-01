package com.opoa.designpattern.principle.srp;

/**
 * @description: 单一职责原则
 * @author: opoa
 * @create: 2023-08-01 22:57
 **/
public class SingleResponsibilityPrinciple1 {

    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
    }

}

class Animal1 {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }
}
