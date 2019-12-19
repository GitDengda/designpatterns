package com.summer.design.patterns.behavioral.strategy;

public class Test {
    public static void main(String[] args) {
        //创建具体的测试实现
        //创建策略上下文时，把具体的策略实现对象注入到策略上下文当中
        //调用上下文对象的方法来完成对具体策略实现的回调
        ChooseVip chooseVip1 = new ChooseVip(new NormalVipStrategy());
        chooseVip1.getVipStrategy();

        ChooseVip chooseVip2 = new ChooseVip(new SuperVipStrategy());
        chooseVip2.getVipStrategy();
    }
}
