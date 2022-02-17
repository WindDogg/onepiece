package com.xue.designpatterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/17 13:46
 */
public abstract class NetMall {

    protected Logger logger = LoggerFactory.getLogger(NetMall.class);

    String uId; //用户id
    String uPws;

    public NetMall(String uId, String uPws) {
        this.uId = uId;
        this.uPws = uPws;
    }

    public String generateGoodsPoster(String skuUrl){
        if (!login(uId,uPws)) return null;
        Map<String,String> reptile = reptile(skuUrl);
        return createBase64(reptile);

    }

    //模拟登录
    protected abstract Boolean login(String uId,String uPws);

    //爬虫提取商品信息
    protected abstract Map<String,String> reptile(String skuUrl);

    //生成商品海报信息
    protected abstract String createBase64(Map<String,String> goodsInfo);




}
