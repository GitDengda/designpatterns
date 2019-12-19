package com.summer.design.patterns.structural.composite;

//叶子节点
public class Leaf extends Component {
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component component) {

    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
