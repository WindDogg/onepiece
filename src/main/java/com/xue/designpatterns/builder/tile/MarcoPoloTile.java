package com.xue.designpatterns.builder.tile;

import com.xue.designpatterns.builder.Matter;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/15 15:36
 */
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "缺省";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "马可波罗品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以文化陶瓷占领市场，享有仿古砖至尊的美誉。";
    }
}
