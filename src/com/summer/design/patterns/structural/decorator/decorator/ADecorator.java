package com.summer.design.patterns.structural.decorator.decorator;

public abstract class ADecorator extends AMilkTea{
    private AMilkTea aMilkTea;

    public ADecorator(AMilkTea aMilkTea) {
        this.aMilkTea = aMilkTea;
    }

    @Override
    public String getDesc() {
        return aMilkTea.getDesc();
    }

    @Override
    public int cost() {
        return aMilkTea.cost();
    }
}
