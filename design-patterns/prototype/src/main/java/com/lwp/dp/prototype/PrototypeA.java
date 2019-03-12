package com.lwp.dp.prototype;

import java.util.List;

/**
 * @Author lanwp
 * @Date 2019/3/12 22:47
 */
public class PrototypeA implements Prototype {

    private int age;
    private String name;
    private List hoppies;

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

    public List getHoppies() {
        return hoppies;
    }

    public void setHoppies(List hoppies) {
        this.hoppies = hoppies;
    }

    @Override
    public String toString() {
        return "PrototypeA@" + this.hashCode() + "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hoppies=" + hoppies +
                '}';
    }

    @Override
    public Prototype clone() {
        PrototypeA obj = new PrototypeA();
        obj.setAge(this.age);
        obj.setName(this.name);
        obj.setHoppies(this.hoppies);
        return obj;
    }
}
