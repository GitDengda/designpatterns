package com.summer.design.patterns.structural.bridge;

public class PhoneXiaoMi extends APhone{
    public void buyPhone() {
        //调用实现类重写后的具体方法
        memory.addMemory();
        System.out.println("买小米");
    }
}
