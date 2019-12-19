package com.summer.design.patterns.behavioral.strategy;

public class NotVipStrategy implements LevelStrategy{
    public void getVipLevel() {
        System.out.println("不是会员");
    }
}
