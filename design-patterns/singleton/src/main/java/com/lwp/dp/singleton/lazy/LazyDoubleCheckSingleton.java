package com.lwp.dp.singleton.lazy;

/**
 * @Author lanwp
 * @Date 2019/3/10 17:39
 *
 * 懒汉模式
 *     改进：
 *        Lazy在static方法中使用synchronized同步使用的是类同步锁，多线程下性能低。修改为双重检查锁模式，将synchronized
 *        同步块放入代码中，只有第一次实例时有多线程同时进入时会阻塞。性能高
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置instance指向刚分配的内存地址
                    //4.初次访问对象
                }
            }
        }
        return instance;
    }
}
