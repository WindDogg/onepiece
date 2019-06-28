package com.xue.designpatterns.builder;

import com.xue.designpatterns.factorymethod.Sender;

import java.util.ArrayList;
import java.util.List;

public interface Builder {
    public void build_cpu();
    public void build_mainboard();
    public void build_memory();
    public void build_disk();
    public void build_power();
    public Computer getComputer();



}
