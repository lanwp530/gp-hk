package com.lwp.dp.proxy.dynamicproxy.simpleproxy;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class MeiPoBuy implements Buy {
    @Override
    public void buy() {
        System.out.println("MeiPoBuy buy");
    }
}
