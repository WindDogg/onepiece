package com.xue.designpatterns.factory.simplefactory;

/**
 * 简单工厂模式
 * @author xhj
 * @version JVM
 * @Date 2022/2/10 15:12
 */
public class Magnate {
    public static void main(String[] args) {
        try {
            Car car = Driver.driverCar("bmw");
            car.drive();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
