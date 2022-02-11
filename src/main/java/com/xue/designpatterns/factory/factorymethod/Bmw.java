package com.xue.designpatterns.factory.factorymethod;

/**
 * 具体产品角色
 * @author xhj
 * @version JVM
 * @Date 2022/2/10 15:04
 */
public class Bmw implements Car {

    @Override
    public void drive() {
        System.out.println("Driving BMW!");
    }
}

