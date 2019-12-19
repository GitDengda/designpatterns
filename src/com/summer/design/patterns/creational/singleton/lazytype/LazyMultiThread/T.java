package com.summer.design.patterns.creational.singleton.lazytype.LazyMultiThread;

public class T implements Runnable {
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+lazySingleton);
    }
}
