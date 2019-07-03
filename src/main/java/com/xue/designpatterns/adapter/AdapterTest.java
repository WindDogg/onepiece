package com.xue.designpatterns.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        TargeTable target = new Wrapper(source);
        target.methodone();
        target.methodtwo();
    }
}
