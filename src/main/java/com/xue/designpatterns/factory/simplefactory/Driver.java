package com.xue.designpatterns.factory.simplefactory;

/**
 * 工厂类角色
 * @author xhj
 * @version JVM
 * @Date 2022/2/10 15:07
 */
public class Driver {
    //返回为抽象产品角色
    public static Car driverCar(String s) throws Exception {
        if (s.equalsIgnoreCase("Benz")){
            return new Benz();
        }else if (s.equalsIgnoreCase("bmw")){
            return new Bmw();
        }else{
            throw new Exception();
        }

    }
}
