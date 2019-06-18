package com.jchen.creational.factory.abstractfactory;

public class PythonStudyFactory implements StudyFactory {
    public Course getCourse() {
        return new PythonCourse();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
