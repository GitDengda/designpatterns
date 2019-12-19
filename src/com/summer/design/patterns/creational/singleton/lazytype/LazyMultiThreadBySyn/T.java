package com.summer.design.patterns.creational.singleton.lazytype.LazyMultiThreadBySyn;

public class T implements Runnable {
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+lazySingleton);
    }
}
