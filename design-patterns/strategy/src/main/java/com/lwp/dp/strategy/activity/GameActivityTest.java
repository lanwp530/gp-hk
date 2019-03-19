package com.lwp.dp.strategy.activity;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class GameActivityTest {
    public static void main(String[] args) {
        createActivity("jump").play();
        createActivity("run").play();
        createActivity("null").play();

        GameActivityFactory.getGameActivityInstance(GameActivityFactory.ActivityType.RUN).play();
        GameActivityFactory.getGameActivityInstance(GameActivityFactory.ActivityType.JUMP).play();

        new GameActivity(GameActivityFactory.getGameActivityInstance(GameActivityFactory.ActivityType.SWIM)).execute();
    }

    public static GameActivityStrategy createActivity(String playActiity) {
//        String playActiity = "jump";
        if (playActiity.equalsIgnoreCase("jump")) {
            return new JumpActivityStrategy();
        } else if (playActiity.equalsIgnoreCase("run")) {
            return new RunActivityStrategy();
        } else if (playActiity.equalsIgnoreCase("swim")) {
            return new SwimActivityStrategy();
        }
        return new EmptyActivityStrategy();
    }
}
