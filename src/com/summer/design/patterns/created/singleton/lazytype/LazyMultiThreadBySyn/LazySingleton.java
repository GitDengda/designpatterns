package com.summer.design.patterns.created.singleton.lazytype.LazyMultiThreadBySyn;

public class LazySingleton {

    //声明一个静态的私有成员，但是不创建实例，在类加载时不会被初始化
    //类运行速度快，但是获取对象较慢
    private static LazySingleton instance = null;

    //私有构造器，为了不让外部能new这个对象
    private LazySingleton(){

    }

    //同步方法
    public synchronized static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    /*
    //同步代码块，两种写法是完全一样的
    public static LazySingleton getInstance(){
        synchronized (LazySingleton.class){
            if (instance == null){
                instance = new LazySingleton();
            }
            return instance;
        }
    }
    */

}
