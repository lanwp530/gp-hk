package com.lwp.dp.strategy.activity;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class RunActivityStrategy implements GameActivityStrategy {
    @Override
    public void play() {
        System.out.println("play 跑步活动");
    }
}
