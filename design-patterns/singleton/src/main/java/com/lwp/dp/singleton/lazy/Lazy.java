package com.lwp.dp.singleton.lazy;

import com.lwp.dp.singleton.hungry.HungrySingleton;

/**
 * @Author lanwp
 * @Date 2019/3/10 17:39
 *
 * 懒汉式单例
 *     缺点：
 *          在static方法中使用synchronized同步使用的是类同步锁，多线程下性能低
 */
public class Lazy {
    private static volatile Lazy instance = null;

    private Lazy() {

    }

    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
