package com.xue.designpatterns.builder.floor;

import com.xue.designpatterns.builder.Matter;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/15 15:35
 */
public class ShengXiangFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣象地板是中国地板行业著名品牌。圣象地板拥有中国驰名商标、" +
                "中国品牌、国家免检、中环境标志认证等多项荣誉。";
    }
}
