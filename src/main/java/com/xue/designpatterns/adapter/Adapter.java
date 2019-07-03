package com.xue.designpatterns.adapter;

public class Adapter extends Source implements TargeTable {
    @Override
    public void methodtwo() {
        System.out.println("this is the methodtwo");
    }
}
