package com.lwp.dp.proxy.dynamicproxy.jdkproxy;


import com.lwp.dp.proxy.Girl;
import com.lwp.dp.proxy.Person;
import com.lwp.dp.proxy.dynamicproxy.cglibproxy.CglibProxyMeiPo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class JDKProxyTest {

    public static void main(String[] args) {

        Object instance = null;
        try {
            instance = new JDKProxyMeiPo().getInstance(new Girl());
            Method method = instance.getClass().getMethod("findLove", null);
            method.invoke(instance);

            Person person = (Person) new CglibProxyMeiPo().getInstance(new Girl());
            person.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person person = null;
        try {
            person = (Person) new JDKProxyMeiPo().getInstance(new Girl());
            person.findLove();

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream fileOutputStream = new FileOutputStream("E://$Proxy0.class");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
