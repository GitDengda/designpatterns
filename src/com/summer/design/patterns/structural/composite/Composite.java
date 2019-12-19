package com.summer.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

//树节点
public class Composite extends Component {
    private List<Component> item = new ArrayList<Component>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component component) {
        item.add(component);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (Component component:item){
            component.print();
        }
    }
}
