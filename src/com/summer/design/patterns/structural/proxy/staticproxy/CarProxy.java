package com.summer.design.patterns.structural.proxy.staticproxy;

public class CarProxy implements Moveable{
    private Moveable moveable;

    public void move() {
        moveable = new Car();

        System.out.println("记录开始");
        moveable.move();
        System.out.println("记录结束");
    }
}
