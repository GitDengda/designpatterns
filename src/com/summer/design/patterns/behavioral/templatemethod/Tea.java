package com.summer.design.patterns.behavioral.templatemethod;

public class Tea extends ACaffeineBeverage {

    @Override
    void brew() {
        System.out.println("冲泡茶叶");
    }

    @Override
    void addCondiments() {

    }

    @Override
    protected boolean needCondiments() {
        return false;
    }
}
