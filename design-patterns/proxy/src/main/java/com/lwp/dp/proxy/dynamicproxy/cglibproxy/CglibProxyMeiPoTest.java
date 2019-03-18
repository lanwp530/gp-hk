package com.lwp.dp.proxy.dynamicproxy.cglibproxy;

import com.lwp.dp.proxy.Girl;
import com.lwp.dp.proxy.Person;
import net.sf.cglib.core.DebuggingClassWriter;

import java.lang.reflect.Method;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class CglibProxyMeiPoTest  {

    public static void main(String[] args) {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://cglib_proxy_classes");

        Object instance = null;
        try {
            instance = new CglibProxyMeiPo().getInstance(new Girl());
            Method method = instance.getClass().getMethod("findLove", null);
            method.invoke(instance);

            Person person = (Person) new CglibProxyMeiPo().getInstance(new Girl());
            person.findLove();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
