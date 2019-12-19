package com.summer.design.patterns.structural.decorator.decorator;

public class Naigai extends ADecorator{
    public Naigai(AMilkTea aMilkTea) {
        super(aMilkTea);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加奶盖";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
