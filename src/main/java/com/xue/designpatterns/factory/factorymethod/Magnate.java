package com.xue.designpatterns.factory.factorymethod;

/**
 *工厂方法模式
 * @author xhj
 * @version JVM
 * @Date 2022/2/10 15:19
 */
public class Magnate {

    public static void main(String[] args) {
        Driver driver = new BenzDriver();
        Car car = driver.driveCar();
        car.drive();
    }
}
