package com.summer.design.patterns.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        //声明接口引用，指向实现类的对象，调用原本的方法
        Target target = new TargetImpl();
        target.request();

        //声明接口引用，指向适配器的对象，此时接口引用调用的就是被适配者的方法
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
