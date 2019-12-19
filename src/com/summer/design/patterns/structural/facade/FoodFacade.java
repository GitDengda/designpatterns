package com.summer.design.patterns.structural.facade;

public class FoodFacade {
    private OrderService orderService = new OrderService();
    private PayService payService = new PayService();
    private SendService sendService = new SendService();

    public void getFood(Food food){
        if (orderService.isOrderSuccess(food)){
            if (payService.isPaySuccess(food)){
                sendService.send(food);
            }
        }
    }
}
