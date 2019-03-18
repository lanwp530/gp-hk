package com.lwp.dp.proxy.dynamicproxy.myproxy;

import com.lwp.dp.proxy.Girl;
import com.lwp.dp.proxy.Person;

import java.lang.reflect.Method;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class GPMeiPoProxy implements GPInvocationHandler {

    Object target;

    public Object getInstance(Person person) {
        this.target = person;
        Class<?> clazz = person.getClass();
//        return GPProxy.newProxyInstance(GPMeiPoProxy.class.getClassLoader(), clazz.getInterfaces(), this);
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("GPMeiPoProxy 前置处理");
        // ********** invoke使用代理对象this.target ***********
        Object obj = method.invoke(this.target, args);
        System.out.println("GPMeiPoProxy 后置处理");
        return obj;
    }
}
