package com.opoa.designpattern.principle.lsp;

/**
 * @description: 里氏替换原则
 * @author: opoa
 * @create: 2023-09-14 23:25
 **/
public class LiskovSubstitutionPrinciple1 {

    public static void main(String[] args) {

        A1 a = new A1();
        System.out.println("11-3=" + a.function1(11, 3));
        System.out.println("18-7=" + a.function1(18, 7));

        System.out.println("<<---------------------------->>");
        B1 b = new B1();
        System.out.println("11-3=" + b.function1(11, 3));
        System.out.println("18-7=" + b.function1(18, 7));
        System.out.println("11+3+10=" + b.function2(11, 3));

    }

}

class A1 {

    public int function1(int a, int b) {
        return a - b;
    }

}

class B1 extends A1 {

    @Override
    public int function1(int a, int b) {
        return a + b;
    }

    public int function2(int a, int b) {
        return function1(a, b) + 10;
    }

}
