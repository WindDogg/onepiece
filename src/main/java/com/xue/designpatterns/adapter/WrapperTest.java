package com.xue.designpatterns.adapter;

public class WrapperTest {
    public static void main(String[] args) {
        Sourceable one = new SourceSubOne();
        Sourceable two = new SourceSubTwo();

        one.methodOne();
        one.methodTwo();
        two.methodOne();
        two.methodTwo();
    }
}
