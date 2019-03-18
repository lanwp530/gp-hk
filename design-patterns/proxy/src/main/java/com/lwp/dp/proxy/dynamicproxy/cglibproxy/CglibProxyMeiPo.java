package com.lwp.dp.proxy.dynamicproxy.cglibproxy;

import com.lwp.dp.proxy.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class CglibProxyMeiPo implements MethodInterceptor {

    Object target;

    public Object getInstance(Person person) {
        this.target = person;
        Class<?> clazz = person.getClass();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("StartTime=[" + System.currentTimeMillis() + "]");
        Object result = methodProxy.invokeSuper(obj, objects);
        System.out.println("EndTime=[" + System.currentTimeMillis() + "]");
        return result;
    }
}
