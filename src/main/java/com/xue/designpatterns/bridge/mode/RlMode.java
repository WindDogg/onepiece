package com.xue.designpatterns.bridge.mode;

import com.xue.designpatterns.adapter.RabateInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 人脸模式
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 23:33
 */
public class RlMode implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(RlMode.class);
    @Override
    public boolean security(String uId) {
        logger.info("人脸模式支付");
        return true;
    }
}
