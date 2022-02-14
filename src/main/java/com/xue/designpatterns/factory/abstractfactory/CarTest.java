package com.xue.designpatterns.factory.abstractfactory;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/14 9:59
 */
public class CarTest {

    //抽象产品：汽车
    interface Car{
        public void driver();
    }

    //具体产品：奔驰
    class Benz implements Car{
        public void driver(){
            System.out.println("Driving Benz");
        }
    }

    //具体产品：宝马
    class Bmw implements Car{
        public void driver(){
            System.out.println("Driving Bmw");
        }
    }

    //抽象产品:自行车
    interface Bicycle{
        public void driver();
    }

    //具体产品：捷安特
    class Jat implements  Bicycle{
        public void driver(){
            System.out.println("Driving Jat");
        }
    }

    //具体产品：美利达
    class Mld implements Bicycle{
        public void driver(){
            System.out.println("Driving Mld");
        }
    }

    //抽象工厂
    interface CarFactory{
        public Car newCar();
        public Bicycle newBicycle();
    }

    //具体工厂
    class FactoryOne implements CarFactory{
        public FactoryOne(){}

        @Override
        public Car newCar() {
            return new Benz();
        }

        @Override
        public Bicycle newBicycle() {
            return new Mld();
        }
    }

    //具体工厂
    class FactoryTwo implements CarFactory{

        @Override
        public Car newCar() {
            return new Bmw();
        }

        @Override
        public Bicycle newBicycle() {
            return new Jat();
        }
    }









}
