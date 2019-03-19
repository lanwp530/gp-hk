package com.lwp.dp.strategy.pay.paystrategy;

import com.lwp.dp.strategy.pay.MsgResult;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public abstract class Payment {

    // 支付类型
    public abstract String getName();

    // 查询余额
    public abstract double queryBlance(String uid);

    public MsgResult pay(String uid, double amount) {
        if (queryBlance(uid) < amount) {
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额：" + amount);
    }




}
