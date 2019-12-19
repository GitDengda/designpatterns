package com.summer.design.patterns.creational.singleton.hungrytype;

//饿汉式的简单实现
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
