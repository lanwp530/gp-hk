package com.lwp.dp.singleton.hungry;

/**
 * @Author lanwp
 * @Date 2019/3/10 17:35
 *
 * 饿汉式静态块单例
 *  缺点：
 *      无论是否被调用,类只要被加载就被new出实例，浪费内存空间
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton INSTANCE;

    static {
        INSTANCE = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return INSTANCE;
    }
}
