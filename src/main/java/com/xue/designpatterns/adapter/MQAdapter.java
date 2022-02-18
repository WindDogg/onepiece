package com.xue.designpatterns.adapter;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import com.alibaba.fastjson.JSON;

/**
 * MQ消息体适配器
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 23:22
 */
public class MQAdapter {

    public static RabateInfo filter(String strJson, Map<String,String> link) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return filter(JSON.parseObject(strJson,Map.class),link);
    }

    public static RabateInfo filter(Map obj,Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RabateInfo rabateInfo = new RabateInfo();
        for (String key :
             link.keySet()) {
            Object val = obj.get(link.get(key));
            RabateInfo.class.getMethod("set"+key.substring(0,1).toUpperCase()
            + key.substring(1),String.class).invoke(rabateInfo,val.toString());

        }

        return rabateInfo;
    }
}
