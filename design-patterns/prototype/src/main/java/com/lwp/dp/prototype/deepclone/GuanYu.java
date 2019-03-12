package com.lwp.dp.prototype.deepclone;

import java.io.*;
import java.util.Date;

/**
 * @Author lanwp
 * @Date 2019/3/12 23:09
 */
public class GuanYu extends Person implements Cloneable, Serializable {
    private QingLongDaDao qingLongDaDao;

    public QingLongDaDao getQingLongDaDao() {
        return qingLongDaDao;
    }

    public void setQingLongDaDao(QingLongDaDao qingLongDaDao) {
        this.qingLongDaDao = qingLongDaDao;
    }

    public GuanYu(QingLongDaDao qingLongDaDao) {
        this.birthday = new Date();
        this.qingLongDaDao = new QingLongDaDao();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            // 内存中完成操作，对象读写是通过字节码直接操作
            // 序列化的操作类似
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            // 完整的对象 new出一个新对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            GuanYu guanYu = (GuanYu) ois.readObject();
            ois.close();

            guanYu.birthday = new Date();
            return guanYu;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object shallowClone(GuanYu target) {
        GuanYu guanYu = new GuanYu(target.qingLongDaDao);
        guanYu.birthday = new Date();
        guanYu.qingLongDaDao = target.qingLongDaDao;
        guanYu.age = target.age;
        guanYu.name = target.name;
        return guanYu;
    }
}
