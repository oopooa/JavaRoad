package com.opoa.designpattern.templatemethod;


/**
 * @program: JavaRoad->AliPayment
 * @description: 支付宝支付
 * @author: opoa
 * @create: 2021-07-26 22:27
 **/
public class AliPayment extends AbstractPaymentProcess {

    @Override
    protected void launchApp() {
        System.out.println("打开支付宝");
    }

    @Override
    protected void faceId() {
        System.out.println("-----支付宝界面-----");
        System.out.println("面容ID识别中...");
    }

    @Override
    protected void paymentResult() {

    }
}
