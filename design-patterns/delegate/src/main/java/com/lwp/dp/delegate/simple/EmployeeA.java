package com.lwp.dp.delegate.simple;

/**
 * @Author lanwp
 * @Date 2019/3/18
 */
public class EmployeeA implements IEmployee{
    @Override
    public void doWork(String command) {
        System.out.println("我是员工A，我开始干活了，擅长加密，执行");
    }
}
