package com.xue.designpatterns.adapter;

import java.util.Date;

/**统一的MQ消息体
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 22:57
 */
public class RabateInfo {

    private String userId; //用户ID

    private String bizId; //业务ID

    private Date bizDate; //业务时间

    private String desc; //业务描述

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getBizDate() {
        return bizDate;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = new Date(Long.parseLong(bizDate));
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
