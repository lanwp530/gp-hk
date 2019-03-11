package com.lwp.dp.singleton.lazy;

/**
 * @Author lanwp
 * @Date 2019/3/10 17:39
 *
 * 懒汉式单例
 *    使用多线程模式debug,显示并发问题
 */
public class LazyNoSecurityTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();

        System.out.println("Executor end");
    }
}

class ExecutorThread implements Runnable{

    @Override
    public void run() {
        System.out.println(LazyNoSecurity.getInstance());
    }
}
