package com.xue.designpatterns.singleton;

public class LazySingleton {

    //保证instance在所有线程中同步
    private static volatile LazySingleton instance =null;
    //private 避免类在外部被实例化
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance()
    {
        //getInstance 方法前家同步
        if (instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }




}
