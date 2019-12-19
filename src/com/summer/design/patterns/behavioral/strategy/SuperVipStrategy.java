package com.summer.design.patterns.behavioral.strategy;

public class SuperVipStrategy implements LevelStrategy{
    public void getVipLevel() {
        System.out.println("超级会员");
    }
}
