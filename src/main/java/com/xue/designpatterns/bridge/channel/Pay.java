package com.xue.designpatterns.bridge.channel;

import com.xue.designpatterns.bridge.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 支付方式
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 23:23
 */
public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected IPayMode payMode;

    public Pay(IPayMode payMode){
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);


}
