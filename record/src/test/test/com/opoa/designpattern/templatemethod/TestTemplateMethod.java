package com.opoa.designpattern.templatemethod;

import org.junit.Test;

/**
 * @program: JavaRoad->TestTemplateMethod
 * @description: 测试模板方法
 * @author: opoa
 * @create: 2021-07-27 21:32
 **/
public class TestTemplateMethod {

    @Test
    public void test() {

        AbstractPaymentProcess aliPay = new AliPayment();
        aliPay.pay(12);

        System.out.println("---------------------------------");

        AbstractPaymentProcess weChatPay = new WeChatPayment();
        weChatPay.pay(6);

    }
}
