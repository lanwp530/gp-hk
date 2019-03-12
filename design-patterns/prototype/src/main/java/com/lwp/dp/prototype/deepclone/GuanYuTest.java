package com.lwp.dp.prototype.deepclone;

/**
 * @Author lanwp
 * @Date 2019/3/12 23:28
 */
public class GuanYuTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        QingLongDaDao qingLongDaDao = new QingLongDaDao();
        GuanYu guanYu = new GuanYu(qingLongDaDao);

        GuanYu guanYu1 = (GuanYu) guanYu.clone();
        System.out.println(guanYu);
        System.out.println(guanYu1);
        System.out.println( "关于是否同一个对象：" + (guanYu == guanYu1));
    }
}
