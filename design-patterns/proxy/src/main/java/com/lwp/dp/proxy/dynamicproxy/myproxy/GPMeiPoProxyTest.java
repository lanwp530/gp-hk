package com.lwp.dp.proxy.dynamicproxy.myproxy;

import com.lwp.dp.proxy.Girl;
import com.lwp.dp.proxy.Person;
import com.lwp.dp.proxy.dynamicproxy.cglibproxy.CglibProxyMeiPo;
import com.lwp.dp.proxy.dynamicproxy.jdkproxy.JDKProxyMeiPo;

import java.lang.reflect.Method;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class GPMeiPoProxyTest {

    public static void main(String[] args) {
        try {
            Person person = (Person) new GPMeiPoProxy().getInstance(new Girl());
            System.out.println(person.getClass());
            person.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
