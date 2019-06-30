package com.xue.designpatterns.abstractfactory;

public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
