package com.xue.designpatterns.template.group;

import com.xue.designpatterns.builder.Matter;
import com.xue.designpatterns.template.HttpClient;
import com.xue.designpatterns.template.NetMall;
import org.junit.Test;
import sun.misc.BASE64Encoder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/17 14:04
 */
public class TaoBaoNetMall extends NetMall {

    public TaoBaoNetMall(String uId, String uPws) {
        super(uId, uPws);
    }

    @Override
    protected Boolean login(String uId, String uPws) {
        logger.info("模拟淘宝⽤户登录 uId：{} uPwd：{}", uId, uPws);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        String str = HttpClient.doGet(skuUrl);
        Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String,String> map = new ConcurrentHashMap<>();
        if (m9.find()){
            map.put("name",m9.group());
        }
        map.put("price","4799.00");
        logger.info("模拟淘宝商品爬虫解析：{} | {} 元 {}", map.get("name"),map.get("price"),skuUrl);
        return map ;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        BASE64Encoder encoder = new BASE64Encoder();
        logger.info("模拟⽣成淘宝商品base64海报");
        return "sdwwdw";
    }



}
