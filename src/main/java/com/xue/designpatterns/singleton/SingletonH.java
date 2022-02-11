package com.xue.designpatterns.singleton;

/**
 * 单例模式 ---饿汉式
 * @author xhj
 * @version JVM
 * @Date 2022/2/11 9:48
 */
public class SingletonH {
    //在自己内部定义自己的一个实例
    //使用private修饰 只供内部调用
    private static SingletonH instance = new SingletonH();
    //将构造方法设置为私有
    private SingletonH(){

    }
    //静态工厂方法，提供了一个供外部访问得到对象的静态方法
    public static SingletonH getInstance(){
        return instance;
    }

}
