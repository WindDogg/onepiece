package com.xue.designpatterns.factory.factorymethod;

/**
 * 具体产品角色
 * @author xhj
 * @version JVM
 * @Date 2022/2/10 15:03
 */
public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Benz!");
    }
}
