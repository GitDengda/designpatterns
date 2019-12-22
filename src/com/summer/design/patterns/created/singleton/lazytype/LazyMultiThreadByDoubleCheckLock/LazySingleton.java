package com.summer.design.patterns.created.singleton.lazytype.LazyMultiThreadByDoubleCheckLock;

public class LazySingleton {

    //声明一个静态的私有成员，但是不创建实例，在类加载时不会被初始化
    //类运行速度快，但是获取对象较慢
    //volatile关键字解决指令重排序的问题
    private volatile static LazySingleton instance = null;

    //私有构造器，为了不让外部能new这个对象
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
