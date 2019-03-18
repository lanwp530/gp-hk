package com.lwp.dp.simplefactory;

import com.lwp.dp.BaoMaCar;
import com.lwp.dp.DaZhongCar;
import com.lwp.dp.ICar;

/**
 * @Author lanwp
 * @Date 2019/3/9 0:04
 */
public class CarFactory {
    public ICar create(String name) {
        if(name == null){
            return null;
        }
        if ("baoma".equalsIgnoreCase(name)) {
            return new BaoMaCar();
        } else if ("dazhong".equalsIgnoreCase(name)) {
            return new DaZhongCar();
        }
        return null;
    }

    public ICar create(Class clazz) {
        if(clazz == null){ return null; }
        try {
            return (ICar) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
