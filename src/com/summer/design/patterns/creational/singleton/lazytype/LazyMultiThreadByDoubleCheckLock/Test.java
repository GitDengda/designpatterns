package com.summer.design.patterns.creational.singleton.lazytype.LazyMultiThreadByDoubleCheckLock;

public class Test {

    public static void main(String[] args) {

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();
    }
}
