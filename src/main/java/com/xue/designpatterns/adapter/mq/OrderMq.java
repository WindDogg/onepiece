package com.xue.designpatterns.adapter.mq;

import java.util.Date;

/**
 * 内部订单MQ
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 10:55
 */
public class OrderMq {

    private String uid; //用户ID

    private String sku; //商品

    private String orderId; //订单ID

    private Date createOrderTime; //下单时间

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }
}
