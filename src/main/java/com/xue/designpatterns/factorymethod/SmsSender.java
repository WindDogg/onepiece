package com.xue.designpatterns.factorymethod;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is a smssender!");
    }
}
