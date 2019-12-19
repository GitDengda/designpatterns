package com.summer.design.patterns.creational.builder;

public abstract class CarBuilder {
    public abstract void buildCarBody();
    public abstract void buildCarWheel();
    public abstract void buildCarEngine();

    public abstract Car makeCar();
}
