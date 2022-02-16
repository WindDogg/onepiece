package com.xue.designpatterns.prototype.util;

import java.util.*;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/16 15:05
 */
public class TopicRandomUtil {

    static public Topic random(Map<String,String> option,String key){
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<String>(keySet);
        Collections.shuffle(keyList);
        HashMap<String,String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        for(String next : keySet){
            String randomKey = keyList.get(idx++);
            if (key.equals(next)){
                keyNew = randomKey;
            }
            optionNew.put(randomKey,option.get(next));
        }

        return new Topic(optionNew,keyNew);

    }
}
