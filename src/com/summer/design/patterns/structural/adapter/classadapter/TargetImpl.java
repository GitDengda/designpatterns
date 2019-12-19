package com.summer.design.patterns.structural.adapter.classadapter;

public class TargetImpl implements Target{
    public void request() {
        System.out.println("实现的目标方法");
    }
}
