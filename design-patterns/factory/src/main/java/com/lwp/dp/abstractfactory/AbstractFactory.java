package com.lwp.dp.abstractfactory;

import com.lwp.dp.ICar;

/**
 * @Author lanwp
 * @Date 2019/3/9 1:17
 */
public interface AbstractFactory {
    ICar createCar();

    IVidio createVidio();
}
