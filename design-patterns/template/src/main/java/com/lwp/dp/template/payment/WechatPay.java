package com.lwp.dp.template.payment;

/**
 * @Author lanwp
 * @Date 2019/3/22
 */
public class WechatPay extends AbstractPayment {
    @Override
    protected void doPay() {
        System.out.println("微信支付..");
    }

    @Override
    protected void afterPay() {
        System.out.println("微信支付后处理");
    }

    @Override
    protected void beforePay() {
        System.out.println("微信支付前准备");
    }
}
