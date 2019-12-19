package com.summer.design.patterns.structural.composite;

//根节点
public abstract class Component {
    public String name;

    public abstract void addChild(Component component);

    public abstract void print();
}
