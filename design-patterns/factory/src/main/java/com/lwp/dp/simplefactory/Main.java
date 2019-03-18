package com.lwp.dp.simplefactory;

import com.lwp.dp.BaoMaCar;

/**
 * @Author lanwp
 * @Date 2019/3/9 0:09
 */
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        factory.create("dazhong").makeCar();
        factory.create(BaoMaCar.class).makeCar();
    }
}
