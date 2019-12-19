package com.summer.design.patterns.creational.factorymode.factorymethod;

public class PythonVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new PythonVideo();
    }
}
