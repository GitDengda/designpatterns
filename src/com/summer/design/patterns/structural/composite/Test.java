package com.summer.design.patterns.structural.composite;

public class Test {
    public static void main(String[] args) {

        Component root = new Composite("root");

        Component branchA = new Composite("--branchA");
        root.addChild(branchA);

        Component branchA_1 = new Composite("----branchA_1");
        branchA.addChild(branchA_1);

        Component leafA = new Leaf("--leafA");
        root.addChild(leafA);

        Component leafA_1 = new Leaf("----leafA_1");
        branchA.addChild(leafA_1);

        Component leafA_1_1 = new Leaf("------leafA_1_1");
        branchA_1.addChild(leafA_1_1);

        root.print();
    }
}
