package com.xue.designpatterns.adapter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询用户第三方下单首单接口
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 10:56
 */
public class POPOrderService {

    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId){
        logger.info("POP商家，查询用户订单是否为首单：{}",uId);
        return true;
    }
}
