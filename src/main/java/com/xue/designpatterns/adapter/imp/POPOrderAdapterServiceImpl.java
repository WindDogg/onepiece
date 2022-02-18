package com.xue.designpatterns.adapter.imp;

import com.xue.designpatterns.adapter.OrderAdapterService;
import com.xue.designpatterns.adapter.service.POPOrderService;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 23:47
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();
    @Override
    public boolean isFisrst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
