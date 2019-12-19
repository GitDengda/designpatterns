package com.summer.design.patterns.behavioral.strategy;

public class NormalVipStrategy implements LevelStrategy{
    public void getVipLevel() {
        System.out.println("普通会员");
    }
}
