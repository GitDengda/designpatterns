package com.summer.design.patterns.creational.builder;

public class Test {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarActualBuilderA();

        Director director = new Director(carBuilder);

        director.construct();
    }
}
