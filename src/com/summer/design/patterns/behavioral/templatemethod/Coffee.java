package com.summer.design.patterns.behavioral.templatemethod;

public class Coffee extends ACaffeineBeverage {

    @Override
    void brew() {
        System.out.println("冲泡咖啡豆");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖");
    }

    @Override
    protected boolean needCondiments() {
        return true;
    }
}
