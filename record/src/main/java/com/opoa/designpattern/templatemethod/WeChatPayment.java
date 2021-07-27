package com.opoa.designpattern.templatemethod;

import java.util.Random;

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

        boolean success = new Random().nextBoolean();
        System.out.println("微信支付结果:");
        if (success) {
            System.out.println("支付成功!");
        } else {
            System.out.println("支付失败!");
        }
    }
}
