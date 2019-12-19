package com.summer.design.patterns.behavioral.strategy;

public class ChooseVip {
    //持有一个策略实现的引用
    private LevelStrategy levelStrategy;

    //声明一个带参数的构造器，调用时注入具体的策略实现类
    public ChooseVip(LevelStrategy levelStrategy) {
        this.levelStrategy = levelStrategy;
    }

    //声明一个方法，调用策略的实现方法
    public void getVipStrategy(){
        levelStrategy.getVipLevel();
    }
}
