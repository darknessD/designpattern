package com.jchen.creational.factory.factorymethod;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getCourse().desc();
    }
}
