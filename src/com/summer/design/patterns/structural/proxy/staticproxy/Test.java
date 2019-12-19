package com.summer.design.patterns.structural.proxy.staticproxy;

public class Test {
    public static void main(String[] args) {
        Moveable moveable = new CarProxy();
        moveable.move();
    }
}
