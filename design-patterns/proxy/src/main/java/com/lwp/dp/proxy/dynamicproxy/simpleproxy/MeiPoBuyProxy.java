package com.lwp.dp.proxy.dynamicproxy.simpleproxy;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class MeiPoBuyProxy implements Buy {

    private Buy target;

    public MeiPoBuyProxy(Buy target) {
        this.target = target;
    }

    @Override
    public void buy() {
        System.out.println("MeiPoBuyProxy buy 前置处理");
        target.buy();
        System.out.println("MeiPoBuyProxy buy 后置处理");
    }
}
