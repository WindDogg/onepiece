package com.xue.designpatterns.bridge.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 密码模式
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 23:33
 */
public class MmMode implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(MmMode.class);
    @Override
    public boolean security(String uId) {
        logger.info("密码支付");
        return true;
    }
}
