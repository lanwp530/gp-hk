package com.lwp.dp.factorymethod;

import com.lwp.dp.BaoMaCar;
import com.lwp.dp.DaZhongCar;
import com.lwp.dp.ICar;

/**
 * @Author lanwp
 * @Date 2019/3/9 0:30
 */
public class DaZhongCarFactory implements ICarFactory {
    @Override
    public ICar create() {
        return new DaZhongCar();
    }
}
