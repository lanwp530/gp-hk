package com.lwp.dp.strategy.activity;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author lanwp
 * @Date 2019/3/19
 */
public class GameActivityFactory {

    private static Map<String, GameActivityStrategy> activityMap = new HashMap<>();

    private GameActivityFactory() {
        activityMap.put(ActivityType.JUMP, new JumpActivityStrategy());
        activityMap.put(ActivityType.SWIM, new SwimActivityStrategy());
        activityMap.put(ActivityType.RUN, new RunActivityStrategy());
        activityMap.put(ActivityType.EMPTY, new EmptyActivityStrategy());
    }
    private static final GameActivityStrategy NON_ACTIVITY = new EmptyActivityStrategy();


    public static GameActivityStrategy getGameActivityInstance(String activityType) {
        GameActivityStrategy gameActivityStrategy = activityMap.get(activityType);
        return gameActivityStrategy == null ? NON_ACTIVITY : gameActivityStrategy;
    }

    public interface ActivityType {
        String JUMP = "jump";
        String SWIM = "swim";
        String RUN = "run";
        String EMPTY = "empty";
    }
}
