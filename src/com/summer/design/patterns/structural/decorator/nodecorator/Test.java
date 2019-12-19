package com.summer.design.patterns.structural.decorator.nodecorator;

public class Test {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        System.out.println(milkTea.getDesc()+milkTea.cost());

        MilkTeaWithZhenZhu milkTeaWithZhenZhu = new MilkTeaWithZhenZhu();
        System.out.println(milkTeaWithZhenZhu.getDesc()+milkTeaWithZhenZhu.cost());

    }
}
