package com.xue.designpatterns.factorymethod;

public class MailSender implements Sender{

    @Override
    public void Send() {
        System.out.println("this is a mailsender!");
    }
}
