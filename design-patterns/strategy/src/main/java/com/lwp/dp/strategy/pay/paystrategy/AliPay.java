package com.lwp.dp.strategy.pay.paystrategy;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "阿里支付";
    }

    @Override
    public double queryBlance(String uid) {
        return 130;
    }
}
