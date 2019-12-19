package com.summer.design.patterns.creational.factorymode.simplefactory;

public class Test {
    public static void main(String[] args) {

        //不使用简单工厂
        Video video1 = new JavaVideo();
        video1.produce();

        //使用简单工厂
        VideoFactory videoFactory1 = new VideoFactory();
        Video video2 = videoFactory1.getVideo("java");
        video2.produce();

        //使用简单工厂的反射
        VideoFactory videoFactory2 = new VideoFactory();
        Video video3 = videoFactory2.getVideoByReflection(JavaVideo.class);
        video3.produce();
    }
}
