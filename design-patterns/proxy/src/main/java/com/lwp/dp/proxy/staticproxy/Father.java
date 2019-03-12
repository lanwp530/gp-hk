package com.lwp.dp.proxy.staticproxy;

import com.lwp.dp.proxy.Person;

/**
 * @Author lanwp
 * @Date 2019/3/13 1:35
 */
public class Father implements Person {

    private Sun sun;

    public Father(Sun sun) {
        this.sun = sun;
    }

    @Override
    public int findLove() {
        System.out.println("父亲物色对象");
        int result = sun.findLove();
        System.out.println("找到对象，双方父母同意，确立关系");
        return result;
    }
}
