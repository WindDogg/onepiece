package com.xue.designpatterns.singleton;

public class President {
    private static volatile President instance = null;
    private President(){
        System.out.println("产生一个总统");
    }
    public static synchronized President getInstnce(){
        if (instance==null){
            instance = new President();
        }else{
            System.out.println("已经生成，不能生成");
        }
        return instance;
    }

    public void getName(){
        System.out.println("我是总统：大傻蛋");
    }
}
