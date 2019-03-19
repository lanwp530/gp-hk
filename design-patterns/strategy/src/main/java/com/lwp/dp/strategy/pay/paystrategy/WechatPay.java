package com.lwp.dp.strategy.pay.paystrategy;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBlance(String uid) {
        return 180;
    }
}
