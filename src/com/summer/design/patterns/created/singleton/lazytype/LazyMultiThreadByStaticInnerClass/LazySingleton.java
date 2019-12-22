package com.summer.design.patterns.created.singleton.lazytype.LazyMultiThreadByStaticInnerClass;

public class LazySingleton {

    private static class InnerClass{
        private static LazySingleton lazySingleton = new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return InnerClass.lazySingleton;
    }

    //私有构造器，为了不让外部能new这个对象
    private LazySingleton(){

    }

}
