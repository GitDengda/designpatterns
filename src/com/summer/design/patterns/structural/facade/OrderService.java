package com.summer.design.patterns.structural.facade;

public class OrderService {
    public boolean isOrderSuccess(Food food){
        System.out.println("下单成功");
        return true;
    }
}
