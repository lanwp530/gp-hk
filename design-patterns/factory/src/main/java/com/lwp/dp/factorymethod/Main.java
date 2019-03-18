package com.lwp.dp.factorymethod;

import com.lwp.dp.BaoMaCar;
import com.lwp.dp.ICar;
import com.lwp.dp.simplefactory.CarFactory;

/**
 * @Author lanwp
 * @Date 2019/3/9 0:09
 */
public class Main {
    public static void main(String[] args) {
        ICar factory = new BaoMaCarFactory().create();
        factory.makeCar();
    }
}
