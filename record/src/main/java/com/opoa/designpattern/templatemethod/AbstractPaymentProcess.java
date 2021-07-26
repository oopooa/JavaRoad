package com.opoa.designpattern.templatemethod;

/**
 * @program: JavaRoad->PaymentProcess
 * @description: 抽象支付流程
 * @author: opoa
 * @create: 2021-07-26 21:51
 **/
public abstract class AbstractPaymentProcess {

    /**
     * 支付流程
     */
    public void pay(double amount) {
        launchApp();
        inputMoney(amount);
        inputPassword();
        faceId();
        paymentResult();
    }

    /**
     * 打开App
     */
    protected abstract void launchApp();

    /**
     * 输入支付金额
     * @param amount 支付金额
     */
    private final void inputMoney(double amount) {
        System.out.println("当前待支付金额: " + amount + "元。");
    }

    /**
     * 输入密码
     */
    protected void inputPassword() {}

    /**
     * 面部识别支付
     */
    protected void faceId() {}

    /**
     * 支付结果
     */
    protected abstract void paymentResult();

}
