package com.lwp.dp.template.payment;

/**
 * @Author lanwp
 * @Date 2019/3/22
 */
public class AliPay extends AbstractPayment {
    @Override
    protected void doPay() {
        System.out.println("阿里支付..");
    }

    @Override
    protected void afterPay() {
        System.out.println("阿里支付后处理");
    }

    @Override
    protected void beforePay() {
        System.out.println("阿里支付前准备");
    }
}
