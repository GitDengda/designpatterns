package com.summer.design.patterns.created.factorymode.factorymethod;

public class PythonVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new PythonVideo();
    }
}
