package com.xue.designpatterns.strategy;

import com.xue.designpatterns.strategy.event.MJCouponDiscount;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 10:28
 */
public class TestCoupon {

    @Test
    public void test_zk(){

        Context<Map<String,String>> context = new Context<Map<String,String>>(new MJCouponDiscount());
        Map<String,String> mapReq = new HashMap<>();
        mapReq.put("x","100");
        mapReq.put("n","10");
        BigDecimal discountAmount = context.discountAmount(mapReq,new BigDecimal(100));
        System.out.println("测试结果：满减优惠后的金额："+discountAmount);
    }
}
