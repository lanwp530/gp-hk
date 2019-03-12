package com.lwp.dp.proxy.staticproxy;

/**
 * @Author lanwp
 * @Date 2019/3/13 1:39
 *
 * 静态代理
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Sun());
        father.findLove();
    }
}
