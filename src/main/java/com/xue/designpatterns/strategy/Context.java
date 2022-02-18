package com.xue.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/17 14:08
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount){
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice){
        return couponDiscount.discountAmount(couponInfo,skuPrice);
    }
}
