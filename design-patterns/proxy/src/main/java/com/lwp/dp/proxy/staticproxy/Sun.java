package com.lwp.dp.proxy.staticproxy;

import com.lwp.dp.proxy.Person;

/**
 * @Author lanwp
 * @Date 2019/3/13 1:34
 */
public class Sun implements Person {
    @Override
    public int findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
        return 0;
    }
}
