package com.opoa.designpattern.principle.ocp;

/**
 * @description: 开闭原则
 * @author: opoa
 * @create: 2023-09-16 12:23
 **/
public class OpenClosedPrinciple1 {

    public static void main(String[] args) {
        Factory1 factory = new Factory1();
        Computer1 macbook = factory.produceComputer("macbook");
        Computer1 surface = factory.produceComputer("surface");
    }

}

interface Computer1 {}

class MacBook1 implements Computer1 {}

class Surface1 implements Computer1 {}

class Factory1 {

    public Computer1 produceComputer(String type) {
        if ("macbook".equals(type)) {
            return new MacBook1();
        }
        if ("surface".equals(type)) {
            return new Surface1();
        }
        return null;
    }

}