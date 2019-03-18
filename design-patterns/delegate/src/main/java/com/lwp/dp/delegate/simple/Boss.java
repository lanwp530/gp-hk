package com.lwp.dp.delegate.simple;

/**
 * @Author lanwp
 * @Date 2019/3/18
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.command(command);
    }
}
