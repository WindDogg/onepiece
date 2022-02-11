package com.xue.designpatterns.factory.factorymethod;

/**
 * 具体工厂角色
 * @author xhj
 * @version JVM
 * @Date 2022/2/10 15:23
 */
public class BmwDriver implements Driver{
    @Override
    public Car driveCar() {
        return new Bmw();
    }
}
