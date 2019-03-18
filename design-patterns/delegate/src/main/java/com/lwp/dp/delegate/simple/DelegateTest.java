package com.lwp.dp.delegate.simple;

/**
 * @Author lanwp
 * @Date 2019/3/18
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("架构", new Leader());
    }
}
