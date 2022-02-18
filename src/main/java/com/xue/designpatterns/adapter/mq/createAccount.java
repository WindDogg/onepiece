package com.xue.designpatterns.adapter.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 注册开户MQ
 * @author xhj
 * @version JVM
 * @Date 2022/2/18 10:55
 */
public class createAccount {

    private String number; //开户编号

    private String address; //开户地

    private Date accountDate; // 开户时间

    private String desc; //开户描述

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString(){
        return JSON.toJSONString(this);
    }
}
