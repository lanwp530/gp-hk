package com.lwp.dp.strategy.activity;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class EmptyActivityStrategy implements GameActivityStrategy {
    @Override
    public void play() {
        System.out.println("没有活动");
    }
}
