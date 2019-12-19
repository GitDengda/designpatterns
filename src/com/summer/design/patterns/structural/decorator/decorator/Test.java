package com.summer.design.patterns.structural.decorator.decorator;

public class Test {
    public static void main(String[] args) {
        AMilkTea milkTea = new MilkTea();
        milkTea = new Zhenzhu(milkTea);
        milkTea = new Zhenzhu(milkTea);
        milkTea = new Naigai(milkTea);

        System.out.println(milkTea.getDesc()+milkTea.cost());

    }
}
