package com.xue.designpatterns.bridge;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/19 22:59
 */
public class PayController {
    private Logger logger = LoggerFactory.getLogger(PayController.class);

    /**
     * 支付方式
     * @param uId 用户ID
     * @param tradeId 交易ID
     * @param amount 交易金额
     * @param channelType 一级交易方式
     * @param modeType    二级交易方式
     * @return
     */
    public boolean doPay(String uId, String tradeId, BigDecimal amount,int channelType,int modeType){
        //微信支付
        if (1 == channelType){

            logger.info("模拟微信渠道支付划账开始。uId:{} tradeId:{} amount:{}",uId,
                    tradeId,amount);

            if (1 == modeType){
                logger.info("密码支付");
            }else if (2 == modeType){
                logger.info("人脸支付");
            }else if (3 == modeType){
                logger.info("指纹支付");
            }

        }else if (2== channelType){

            logger.info("模拟支付宝渠道支付划账开始。uId:{} tradeId:{} amount:{}",uId,
                    tradeId,amount);

            if (1 == modeType){
                logger.info("密码支付");
            }else if (2 == modeType){
                logger.info("人脸支付");
            }else if (3 == modeType){
                logger.info("指纹支付");
            }
        }

        return true;
    }

    @Test
    public void testPay(){
        PayController pay = new PayController();
        System.out.println("\r\n模拟测试场景；微信支付、人脸支付");
        pay.doPay("weixin10111121","1023555",new BigDecimal(100),1,2);
        System.out.println("\r\n" +
                "模拟测试场景；支付宝，指纹支付");
        pay.doPay("zhifubao_1548","22135",new BigDecimal(123),2,3);
    }
}
