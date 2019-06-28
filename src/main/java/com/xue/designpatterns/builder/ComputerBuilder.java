package com.xue.designpatterns.builder;

public class ComputerBuilder implements Builder {

    private Computer computer = new Computer();
    @Override
    public void build_cpu() {
        computer.parts.add("采用INTEL的CPU");
    }

    @Override
    public void build_mainboard() {
        computer.parts.add("采用大型主板");
    }

    @Override
    public void build_memory() {
        computer.parts.add("采用8g内存");

    }

    @Override
    public void build_disk() {
        computer.parts.add("采用1TB固态硬盘");
    }

    @Override
    public void build_power() {
        computer.parts.add("采用快速充电");

    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
