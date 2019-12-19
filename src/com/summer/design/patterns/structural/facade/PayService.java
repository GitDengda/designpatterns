package com.summer.design.patterns.structural.facade;

public class PayService {
    public boolean isPaySuccess(Food food){
        System.out.println("支付成功");
        return true;
    }
}
