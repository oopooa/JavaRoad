package com.opoa.designpattern.templatemethod;

/**
 * @program: JavaRoad->QQPayment
 * @description: QQ支付
 * @author: opoa
 * @create: 2021-07-26 22:24
 **/
public class QQPayment extends AbstractPaymentProcess {

    @Override
    protected void launchApp() {
        System.out.println("打开QQ");
    }

    @Override
    protected void inputPassword() {
        System.out.println("-----QQ支付界面-----");
        System.out.println("密码输入中...");
        System.out.println("密码校验中...");
    }

    @Override
    protected void paymentResult() {

    }
}
