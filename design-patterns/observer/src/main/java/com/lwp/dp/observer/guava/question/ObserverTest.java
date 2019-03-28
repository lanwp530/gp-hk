package com.lwp.dp.observer.guava.question;

import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lanwp
 * @Date 2019/3/28
 *
 * guava的观察者模式
 */
public class ObserverTest {
    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaQuestionSubscribe questionEvent = new GuavaQuestionSubscribe();
        eventBus.register(questionEvent);
        List<Teacher> teachers = new ArrayList<>();
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");

        teachers.add(new Teacher("Tom", 1));
        teachers.add(new Teacher("Mic", 2));
        eventBus.post(new GPerQuestionEvent("GPer生态圈", question, teachers));
        eventBus.post(new GPerQuestionEvent("Game生态圈", question, teachers));
//        eventBus.post("Mic");

        //从Struts到SpringMVC的升级
        //因为Struts面向的类，而SpringMVC面向的是方法

        //前面两者面向的是类，Guava面向是方法

        //能够轻松落地观察模式的一种解决方案
        //MQ
    }
}
