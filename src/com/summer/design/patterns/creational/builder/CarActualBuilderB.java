package com.summer.design.patterns.creational.builder;

public class CarActualBuilderB extends CarBuilder{
    private Car car = new Car();

    @Override
    public void buildCarBody() {
        System.out.println("建造B类车身");
    }

    @Override
    public void buildCarWheel() {
        System.out.println("建造B类车轮");
    }

    @Override
    public void buildCarEngine() {
        System.out.println("建造B类发动机");
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
