package com.summer.design.patterns.created.builder;

public class Test {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarActualBuilderA();

        Director director = new Director(carBuilder);

        director.construct();
    }
}
