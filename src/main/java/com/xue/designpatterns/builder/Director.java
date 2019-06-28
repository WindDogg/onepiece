package com.xue.designpatterns.builder;

public class Director {
    public void construct(Builder builder){
        builder.build_cpu();
        builder.build_mainboard();
        builder.build_memory();
        builder.build_disk();
        builder.build_power();
    }
}
