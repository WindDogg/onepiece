package com.xue.designpatterns.prototype;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/16 11:00
 */
public class AnswerQuestion {

    private String name;
    private String key;

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
