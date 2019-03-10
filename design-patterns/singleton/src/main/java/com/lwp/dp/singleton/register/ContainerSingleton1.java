package com.lwp.dp.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *  @Author lanwp
 *  @Date 2019/3/11 1:00
 */
//Spring中的做法，就是用这种注册式单例
public class ContainerSingleton1 {
    private ContainerSingleton1(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    public static Object getInstance(String className){
        Object obj = ioc.get(className);
        if (obj != null ) {
            return obj;
        }
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return obj;
    }
}
