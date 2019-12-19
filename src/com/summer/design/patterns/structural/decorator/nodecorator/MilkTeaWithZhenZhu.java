package com.summer.design.patterns.structural.decorator.nodecorator;

public class MilkTeaWithZhenZhu extends MilkTea{
    @Override
    public String getDesc() {
        return super.getDesc()+"  加珍珠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
