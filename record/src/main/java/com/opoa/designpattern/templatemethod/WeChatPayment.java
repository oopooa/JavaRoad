package com.opoa.designpattern.templatemethod;

/**
 * @program: JavaRoad->WeChatPayment
 * @description: 微信支付
 * @author: opoa
 * @create: 2021-07-26 22:25
 **/
public class WeChatPayment extends AbstractPaymentProcess {

    @Override
    protected void launchApp() {
        System.out.println("打开微信");
    }

    @Override
    protected void inputPassword() {
        System.out.println("-----微信支付界面-----");
        System.out.println("密码输入中...");
        System.out.println("密码校验中...");
    }

    @Override
    protected void paymentResult() {

    }
}
