package com.lwp.dp.singleton;

import com.lwp.dp.singleton.seriable.SeriableSingleton;
import com.lwp.dp.singleton.threadlocal.ThreadLocalSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author lanwp
 * @Date 2019/3/11 0:48
 */
public class SeriableSingletonTest {

    public static void main(String[] args) {

        /*try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    System.out.println(SeriableSingleton.getInstance());
                }
            }, 30, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        test();
    }

    public static void test() {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
