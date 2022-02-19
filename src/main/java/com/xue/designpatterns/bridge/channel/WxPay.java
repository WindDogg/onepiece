package com.xue.designpatterns.bridge.channel;

import com.xue.designpatterns.bridge.mode.IPayMode;

import java.math.BigDecimal;

/**
 * 微信支付
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 23:28
 */
public class WxPay extends Pay{

    public WxPay(IPayMode iPayMode){
        super(iPayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟微信渠道⽀付划账开始。uId：{} tradeId：{} amount：{}",
                uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟微信渠道⽀付⻛控校验。uId：{} tradeId：{} security： {}", uId, tradeId, security);
        if (!security) {
            logger.info("模拟微信渠道⽀付划账拦截。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟微信渠道⽀付划账成功。uId：{} tradeId：{} amount：{}",
                uId, tradeId, amount);
        return "0000";
    }
}
