package com.jchen.creational.factory.abstractfactory;

public class Test {
    public static void main(String[] args) {
        StudyFactory studyFactory = new JavaStudyFactory();
        studyFactory.getArticle().desc();
        studyFactory.getCourse().desc();

        StudyFactory pystudyFactory = new PythonStudyFactory();
        pystudyFactory.getCourse().desc();
        pystudyFactory.getArticle().desc();
    }
}
