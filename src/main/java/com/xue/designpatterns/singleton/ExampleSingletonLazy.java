package com.xue.designpatterns.singleton;

public class ExampleSingletonLazy {
    public static void main(String[] args) {
        President pr1 = President.getInstnce();
        pr1.getName();
        President pr2 = President.getInstnce();
        pr2.getName();
        if (pr1==pr2){
            System.out.println("他们是同一个人");
        }else{
            System.out.println("他们不是同一个人");
        }
    }
}
