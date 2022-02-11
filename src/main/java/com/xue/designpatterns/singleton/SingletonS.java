package com.xue.designpatterns.singleton;

/**
 * 单例模式--懒汉式
 * @author xhj
 * @version JVM
 * @Date 2022/2/11 9:49
 */
public class SingletonS {
    //和饿汉式的区别

    private static SingletonS instance = null;
    //将构造函数设置为私有
    private SingletonS(){

    }

    //静态工厂方法
    public static synchronized SingletonS getInstance(){
        if (instance == null){
            instance = new SingletonS();
        }
        return instance;
    }
    Runtime run = Runtime.getRuntime();
}
