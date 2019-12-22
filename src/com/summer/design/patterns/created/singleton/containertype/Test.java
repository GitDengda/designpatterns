package com.summer.design.patterns.created.singleton.containertype;

public class Test {
    public static void main(String[] args) {

        ContainerSingleton.putInstance("key",new Object());

        Object instance = ContainerSingleton.getInstance("key");

        System.out.println(instance);
    }
}
