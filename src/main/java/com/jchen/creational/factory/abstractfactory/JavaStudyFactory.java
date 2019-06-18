package com.jchen.creational.factory.abstractfactory;

public class JavaStudyFactory implements StudyFactory {
    public Course getCourse() {
        return new JavaCourse();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
