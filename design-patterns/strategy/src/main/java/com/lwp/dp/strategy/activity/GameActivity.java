package com.lwp.dp.strategy.activity;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class GameActivity {
    private GameActivityStrategy gameActivityStrategy;

    public GameActivity(GameActivityStrategy strategy) {
        this.gameActivityStrategy = strategy;
    }

    public void execute() {
        this.gameActivityStrategy.play();
    }
}
