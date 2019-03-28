package com.lwp.dp.observer.guava.question;

import com.google.common.eventbus.Subscribe;
import com.lwp.dp.observer.javaobserver.GPer;

import java.util.List;

/**
 * @Author lanwp
 * @Date 2019/3/28
 */
public class GuavaQuestionSubscribe {

    @Subscribe
    public void subscribe(GPerQuestionEvent event){
//        System.out.println("执行subscribe方法，传入的参数是：" + str);
        System.out.println("执行subscribe方法");
        System.out.println("===============================");
        List<Teacher> teachers = event.getTeachers();
        if (teachers != null) {
            for (int i = 0; i < teachers.size(); i++) {
                Question question = event.getQuestion();
                System.out.println(teachers.get(i).getName() + "老师，你好！\n" +
                        "您收到了一个来自“" + event.getGperName() + "”的提问，希望您解答，问题内容如下：\n" +
                        question.getContent() + "\n" +
                        "提问者：" + question.getUserName());
            }
        }
    }
}
