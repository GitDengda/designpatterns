package com.summer.design.patterns.created.singleton.hungrytype;

//饿汉式的简单实现
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return instance;
    }

    //防止序列化
    private Object readResolve(){
        return instance;
    }
}
