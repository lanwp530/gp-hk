package com.lwp.dp.abstractfactory;

/**
 * @Author lanwp
 * @Date 2019/3/9 1:21
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new BaoMaFactory();
        factory.createCar().makeCar();
        factory.createVidio().playVidio();
    }
}
