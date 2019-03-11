package com.lwp.dp.singleton;

import com.lwp.dp.singleton.lazy.LazyInnerClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author lanwp
 * @Date 2019/3/11 23:02
 */
public class LazyInnerClassTest {

    public static void main(String[] args) {
        try {
            LazyInnerClass t2 = LazyInnerClass.getInstance();

            Class clazz = LazyInnerClass.class;
            //private的构造器 这里会报异常(java.lang.IllegalAccessException)
//            LazyInnerClass t1 = LazyInnerClass.class.newInstance();
            // 反射实例对象，破坏单例
            Constructor declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            LazyInnerClass t1 = (LazyInnerClass) declaredConstructor.newInstance();
            System.out.println(t1);
            System.out.println(t2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
