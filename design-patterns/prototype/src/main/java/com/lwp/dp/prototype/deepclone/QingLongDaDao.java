package com.lwp.dp.prototype.deepclone;

import java.io.Serializable;

/**
 * @Author lanwp
 * @Date 2019/3/12 23:11
 */
public class QingLongDaDao implements Serializable {
    private int weight;
    private int length;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
