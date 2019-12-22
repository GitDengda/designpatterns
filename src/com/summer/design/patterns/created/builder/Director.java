package com.summer.design.patterns.created.builder;

public class Director {
    private CarBuilder carBuilder = null;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct() {
        carBuilder.buildCarBody();
        carBuilder.buildCarWheel();
        carBuilder.buildCarEngine();
        return carBuilder.makeCar();
    }
}
