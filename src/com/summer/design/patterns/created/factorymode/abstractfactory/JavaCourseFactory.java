package com.summer.design.patterns.created.factorymode.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
