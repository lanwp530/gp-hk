package com.lwp.dp.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public interface GPInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
