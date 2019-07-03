package com.xue.designpatterns.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        TargeTable target = new Adapter();
        target.methodone();
        target.methodtwo();
    }
}
