package com.xue.designpatterns.abstractfactory;

public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("this is a mailsender");
    }
}
