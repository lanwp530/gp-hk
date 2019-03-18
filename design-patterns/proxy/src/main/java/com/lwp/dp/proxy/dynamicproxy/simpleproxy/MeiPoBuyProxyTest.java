package com.lwp.dp.proxy.dynamicproxy.simpleproxy;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class MeiPoBuyProxyTest {
    public static void main(String[] args) {
        MeiPoBuyProxy proxy = new MeiPoBuyProxy(new MeiPoBuy());
        proxy.buy();
    }
}
