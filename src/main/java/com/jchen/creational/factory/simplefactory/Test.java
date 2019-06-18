package com.jchen.creational.factory.simplefactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        Course course = courseFactory.getCourse("Java");
        course.desc();
    }
}
