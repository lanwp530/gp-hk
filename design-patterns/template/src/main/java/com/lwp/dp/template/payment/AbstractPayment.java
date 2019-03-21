package com.lwp.dp.template.payment;

/**
 * @Author lanwp
 * @Date 2019/3/22
 */
public abstract class AbstractPayment {

    protected final void pay() {
        beforePay();
        doPay();
        afterPay();
    }

    protected abstract void doPay();

    protected abstract void afterPay();

    protected abstract void beforePay();
}
