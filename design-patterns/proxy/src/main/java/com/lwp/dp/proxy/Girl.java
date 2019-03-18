package com.lwp.dp.proxy;

import com.lwp.dp.proxy.Person;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class Girl implements Person {
    @Override
    public int findLove() {
        System.out.println("高富帅");
        System.out.println("180cm");
        return 0;
    }
}
