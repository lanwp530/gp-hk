package com.lwp.dp.singleton.lazy;

/**
 * @Author lanwp
 * @Date 2019/3/10 17:39
 *
 * 懒汉式单例
 *     缺点：
 *          在static方法中使用synchronized同步使用的是类同步锁，多线程下性能低
 */
public class LazyNoSecurity {
    private static volatile LazyNoSecurity instance = null;

    private LazyNoSecurity() {

    }

    public static LazyNoSecurity getInstance() {
        if (instance == null) {
            instance = new LazyNoSecurity();
        }
        return instance;
    }
}
