package com.xue.designpatterns.builder.tile;

import com.xue.designpatterns.builder.Matter;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/15 15:36
 */
public class DongPengTile implements Matter {


    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏地砖";
    }

    @Override
    public String model() {
        return "10001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，口碑传播品牌为宗旨，2014年品牌价值" +
                "132.35亿元，位列建陶业榜首。";
    }
}
