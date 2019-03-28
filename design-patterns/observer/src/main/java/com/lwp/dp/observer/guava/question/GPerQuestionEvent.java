package com.lwp.dp.observer.guava.question;

import java.util.List;

/**
 * @Author lanwp
 * @Date 2019/3/29
 */
public class GPerQuestionEvent {
    private String gperName;

    private Question question;

    private List<Teacher> teachers;

    private long time;

    public GPerQuestionEvent(String gperName, Question question, List<Teacher> teachers) {
        this.gperName = gperName;
        this.question = question;
        this.teachers = teachers;
        this.time = System.currentTimeMillis();
    }

    public String getGperName() {
        return gperName;
    }

    public GPerQuestionEvent setGperName(String gperName) {
        this.gperName = gperName;
        return this;
    }

    public Question getQuestion() {
        return question;
    }

    public GPerQuestionEvent setQuestion(Question question) {
        this.question = question;
        return this;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public GPerQuestionEvent setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
        return this;
    }

    public long getTime() {
        return time;
    }

    public GPerQuestionEvent setTime(long time) {
        this.time = time;
        return this;
    }
}
