package com.opoa.designpattern.principle.ocp;

/**
 * @description: 开闭原则
 * @author: opoa
 * @create: 2023-09-16 12:30
 **/
public class OpenClosedPrinciple2 {

    public static void main(String[] args) {
        Factory2 macbookFactory = new MacbookFactory();
        Computer2 macbook = macbookFactory.produceComputer();
        Factory2 surfaceFactory = new SurfaceFactory();
        Computer2 surface = surfaceFactory.produceComputer();
    }

}

interface Computer2 {}

interface Factory2 {

    /**
     * 生产电脑
     *
     * @return 电脑
     */
    Computer2 produceComputer();

}

class Macbook2 implements Computer2 {}
class Surface2 implements Computer2 {}

class MacbookFactory implements Factory2 {

    @Override
    public Computer2 produceComputer() {
        return new Macbook2();
    }

}

class SurfaceFactory implements Factory2 {

    @Override
    public Computer2 produceComputer() {
        return new Surface2();
    }

}
