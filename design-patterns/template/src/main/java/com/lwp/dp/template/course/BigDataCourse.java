package com.lwp.dp.template.course;

/**
 * Created by lwp on 2019/3/22.
 */
public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
