package com.summer.design.patterns.creational.singleton.enumtype;

public class Test {

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.instance;

        instance.printTest();
    }
}
