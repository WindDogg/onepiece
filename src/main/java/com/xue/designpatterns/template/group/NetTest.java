package com.xue.designpatterns.template.group;

import com.xue.designpatterns.template.NetMall;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/17 18:00
 */
public class NetTest {

    protected Logger logger = LoggerFactory.getLogger(NetMall.class);

    @Test
    public void test_NetMall(){
        NetMall netMall = new TaoBaoNetMall("100001","********");
        String base = netMall.generateGoodsPoster("https://detail.tmall.com/item.htm");
        logger.info("测试结果：{}",base);
    }
}
