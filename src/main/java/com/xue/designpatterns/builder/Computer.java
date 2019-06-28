package com.xue.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    List<String> parts = new ArrayList<String>();
    public void show(){
        for (String s: parts) {
            System.out.println(s);
        }
    }
}
