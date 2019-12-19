package com.summer.design.patterns.structural.bridge;

public abstract class APhone {

    //定义实现类接口的对象
    public Memory memory;

    public void setMemory(Memory memory){
        this.memory = memory;
    }

    //定义基本业务方法
    public abstract void buyPhone();
}
