package com.summer.design.patterns.created.singleton.enumtype;

public enum EnumSingleton {

    instance{
        protected void printTest(){
            System.out.println("这是方法调用");
        }
    };

    protected abstract void printTest();
}
