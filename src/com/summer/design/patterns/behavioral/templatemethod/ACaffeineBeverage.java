package com.summer.design.patterns.behavioral.templatemethod;

public abstract class ACaffeineBeverage {

    //不希望执行顺序被改变所以用final修饰
    final void preparRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (needCondiments()) {
            addCondiments();
        }
    }

    //实现细节不同的抽象方法
    abstract void brew();

    //实现细节不同的抽象方法
    abstract void addCondiments();

    //固定算法，用final修饰
    final void boilWater() {
        System.out.println("烧水");
    }

    //固定算法，用final修饰
    final void pourInCup() {
        System.out.println("倒进杯子");
    }

    //钩子方法
    protected boolean needCondiments() {
        return false;
    }
}
