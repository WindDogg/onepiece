package com.xue.designpatterns.adapter;

public class Wrapper implements TargeTable {
    private Source source;
    public Wrapper(Source source){
        super();
        this.source=source;

    }
    @Override
    public void methodone() {
        source.methodone();

    }

    @Override
    public void methodtwo() {
        System.out.println("this is methodtwo");

    }


}
