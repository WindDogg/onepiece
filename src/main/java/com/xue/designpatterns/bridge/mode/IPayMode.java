package com.xue.designpatterns.bridge.mode;

/**
 * 支付模式
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 23:25
 */
public interface IPayMode {

    public boolean security(String uId);
}
