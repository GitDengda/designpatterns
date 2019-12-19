package com.summer.design.patterns.structural.adapter.classadapter;

public class Adapter extends Adapted implements Target{
    public void request() {
        super.adaptedRequest();
    }
}
