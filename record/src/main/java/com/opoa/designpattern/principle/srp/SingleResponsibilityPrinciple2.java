package com.opoa.designpattern.principle.srp;

/**
 * @description: 单一职责原则
 * @author: opoa
 * @create: 2023-08-01 23:01
 **/
public class SingleResponsibilityPrinciple2 {

    public static void main(String[] args) {
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.breathe("牛");
        terrestrial.breathe("羊");
        terrestrial.breathe("猪");

        Aquatic aquatic = new Aquatic();
        aquatic.breathe("鱼");
    }

}

class Terrestrial {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }
}

class Aquatic {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸水");
    }
}