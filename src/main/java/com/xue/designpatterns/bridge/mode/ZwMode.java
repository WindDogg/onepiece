package com.xue.designpatterns.bridge.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 指纹模式
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 23:34
 */
public class ZwMode implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(ZwMode.class);
    @Override
    public boolean security(String uId) {
        logger.info("指纹模式支付");
        return true;
    }
}
