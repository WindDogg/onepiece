package com.xue.designpatterns.adapter.imp;

import com.xue.designpatterns.adapter.OrderAdapterService;
import com.xue.designpatterns.adapter.service.OrderService;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 23:47
 */
public class InsiderOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFisrst(String uId) {
        return orderService.queryUserOrderCount(uId)<=1;
    }
}
