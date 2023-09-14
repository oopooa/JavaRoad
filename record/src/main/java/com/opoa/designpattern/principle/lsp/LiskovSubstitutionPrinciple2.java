package com.opoa.designpattern.principle.lsp;

/**
 * @description: 里氏替换原则
 * @author: opoa
 * @create: 2023-09-14 23:25
 **/
public class LiskovSubstitutionPrinciple2 {

    public static void main(String[] args) {

        A2 a = new A2();
        System.out.println("11-3=" + a.function1(11, 3));
        System.out.println("18-7=" + a.function1(18, 7));

        System.out.println("<<---------------------------->>");
        B2 b = new B2();
        System.out.println("11-3=" + b.function1(11, 3));
        System.out.println("18-7=" + b.function1(18, 7));
        System.out.println("11+3+10=" + b.function2(11, 3));

        System.out.println("<<---------------------------->>");
        System.out.println("11-3=" + b.function3(11, 3));

    }

}

class Base {

}

class A2 extends Base {

    public int function1(int a, int b) {
        return a - b;
    }

}

class B2 extends Base {

    // 如果B2嘞需要使用A2类的方法, 使用组合关系
    private A2 a2 = new A2();

    public int function1(int a, int b) {
        return a + b;
    }

    public int function2(int a, int b) {
        return function1(a, b) + 10;
    }

    public int function3(int a, int b) {
        return this.a2.function1(a, b);
    }

}
