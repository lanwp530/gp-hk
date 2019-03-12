package com.lwp.dp.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lanwp
 * @Date 2019/3/12 22:51
 */
public class PrototypeTest {
    public static void main(String[] args) {
        PrototypeA a = new PrototypeA();
        a.setAge(18);
        a.setName("名字");
        List hoppies = new ArrayList<String>();
        a.setHoppies(hoppies);

        Client client = new Client();
        PrototypeA copy = (PrototypeA) client.startClone(a);
        System.out.println(a);
        System.out.println(copy);

        System.out.println("克隆对象引用类型地址的值：" + copy.getHoppies());
        System.out.println("原对象引用类型地址的值：" + a.getHoppies());
        System.out.println("对象地址比较：" + (copy.getHoppies() == a.getHoppies()));
    }
}
