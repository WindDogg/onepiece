package com.xue.designpatterns.bridge;

import com.xue.designpatterns.bridge.channel.WxPay;
import com.xue.designpatterns.bridge.channel.ZfPay;
import com.xue.designpatterns.bridge.mode.RlMode;
import com.xue.designpatterns.bridge.mode.ZwMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 23:39
 */
public class TestBridge {

    @Test
    public void testPay(){
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式");

        WxPay wxPay =  new WxPay(new RlMode());
        wxPay.transfer("100012","12223560",new BigDecimal(222222));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹支付方式");

        ZfPay zfPay = new ZfPay(new ZwMode());
        zfPay.transfer("0213256","155988",new BigDecimal(456));
    }
}
