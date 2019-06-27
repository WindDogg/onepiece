package com.xue.designpatterns.factorymethod;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender=factory.produce("sms");
        Sender sender1 = SendFactory.produceMail();
        sender1.Send();
        sender.Send();
    }
}
