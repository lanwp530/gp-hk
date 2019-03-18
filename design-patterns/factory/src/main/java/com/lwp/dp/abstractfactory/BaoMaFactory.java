package com.lwp.dp.abstractfactory;

import com.lwp.dp.BaoMaCar;
import com.lwp.dp.ICar;

/**
 * @Author lanwp
 * @Date 2019/3/9 1:20
 */
public class BaoMaFactory implements AbstractFactory {
    @Override
    public ICar createCar() {
        return new BaoMaCar();
    }

    @Override
    public IVidio createVidio() {
        return new BaoMaVidio();
    }
}
