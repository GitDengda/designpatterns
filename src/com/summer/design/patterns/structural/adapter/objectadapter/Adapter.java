package com.summer.design.patterns.structural.adapter.objectadapter;

public class Adapter implements Target{
    private Adapted adapted = new Adapted();

    public void request() {
        adapted.adaptedRequest();
    }
}
