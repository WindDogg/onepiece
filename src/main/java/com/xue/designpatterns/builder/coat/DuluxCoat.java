package com.xue.designpatterns.builder.coat;

import com.xue.designpatterns.builder.Matter;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/15 15:34
 */
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年" +
                "全球有5000万户家庭使用多乐士油漆。";
    }
}
