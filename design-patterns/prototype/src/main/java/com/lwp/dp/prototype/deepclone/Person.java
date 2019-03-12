package com.lwp.dp.prototype.deepclone;

import java.util.Date;

/**
 * @Author lanwp
 * @Date 2019/3/12 23:08
 */
public class Person {
    protected int age;
    protected String name;
    protected Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
