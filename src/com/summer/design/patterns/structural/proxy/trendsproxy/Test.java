package com.summer.design.patterns.structural.proxy.trendsproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Moveable car = new Car();
        InvocationHandler handler = new ProxyHandler(car);
        Moveable moveable = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), handler);

        moveable.move();
    }
}
