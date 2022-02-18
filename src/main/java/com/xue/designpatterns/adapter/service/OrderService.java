package com.xue.designpatterns.adapter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询用户内部下单数量接口
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 10:56
 */
public class OrderService {

    private Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}",userId);
        return 10L;
    }
}
