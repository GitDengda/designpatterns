package com.summer.design.patterns.structural.decorator.decorator;

public class Zhenzhu extends ADecorator {
    public Zhenzhu(AMilkTea aMilkTea) {
        super(aMilkTea);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+" 加珍珠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
