package com.lwp.dp.template.course;

/**
 * Created by lwp on 2019/3/22.
 */
public class NetworkCourseTest {
    public static void main(String[] args) {

        System.out.println("---Java架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();

    }
}
