package com.lwp.dp.singleton.threadlocal;

/**
 * @Author lanwp
 * @Date 2019/3/10 23:14
 *
 * 对于线程是单例
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadlocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static final ThreadLocalSingleton getInstance() {
        return threadlocalInstance.get();
    }
}
