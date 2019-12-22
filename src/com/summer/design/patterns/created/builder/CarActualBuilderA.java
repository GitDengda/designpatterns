package com.summer.design.patterns.created.builder;

public class CarActualBuilderA extends CarBuilder{
    private Car car = new Car();

    @Override
    public void buildCarBody() {
        System.out.println("建造A类车身");
    }

    @Override
    public void buildCarWheel() {
        System.out.println("建造A类车轮");
    }

    @Override
    public void buildCarEngine() {
        System.out.println("建造A类发动机");
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
