package com.summer.design.patterns.creational.factorymode.factorymethod;

public class JavaVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new JavaVideo();
    }
}
