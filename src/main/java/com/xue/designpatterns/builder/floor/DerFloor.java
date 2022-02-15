package com.xue.designpatterns.builder.floor;

import com.xue.designpatterns.builder.Matter;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/15 15:35
 */
public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "德尔集团是全球领先的专业木地板制造商，北京2008年奥运会家装和" +
                "公装地板供应商";
    }
}
