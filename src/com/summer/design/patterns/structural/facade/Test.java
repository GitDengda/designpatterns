package com.summer.design.patterns.structural.facade;

public class Test {
    public static void main(String[] args) {
        Food food = new Food();
        FoodFacade foodFacade = new FoodFacade();
        foodFacade.getFood(food);
    }
}
