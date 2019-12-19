package com.summer.design.patterns.creational.singleton.hungrytype;

public class Test {

    public static void main(String[] args) {

        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
    }
}
