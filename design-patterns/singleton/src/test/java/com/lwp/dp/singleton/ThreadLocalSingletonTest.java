package com.lwp.dp.singleton;

import com.lwp.dp.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @Author lanwp
 * @Date 2019/3/10 23:25
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t = new Thread(() -> {
            System.out.println(ThreadLocalSingleton.getInstance());
            System.out.println(ThreadLocalSingleton.getInstance());
        });
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /*try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    System.out.println(ThreadLocalSingleton.getInstance());
                }
            }, 60, 3);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
