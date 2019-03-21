package com.lwp.dp.template.payment;

/**
 * @Author lanwp
 * @Date 2019/3/22
 */
public class PaymentTest {
    public static void main(String[] args) {
        AbstractPayment aliPay = new AliPay();
        aliPay.pay();

        AbstractPayment wechatPay = new WechatPay();
        wechatPay.pay();
    }
}
