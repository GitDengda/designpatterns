package com.summer.design.patterns.created.singleton.lazytype.LazyMultiThreadByStaticInnerClass;

public class Test {

    public static void main(String[] args) {

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();
    }
}
