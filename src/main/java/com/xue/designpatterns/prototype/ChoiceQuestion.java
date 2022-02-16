package com.xue.designpatterns.prototype;

import java.util.Map;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/16 10:57
 */
public class ChoiceQuestion {
    private String name; //题目
    private Map<String,String> option;//选项
    private String key;//答案

    public ChoiceQuestion(){

    }

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
