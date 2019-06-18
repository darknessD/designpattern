package com.jchen.creational.factory.factorymethod;

public class JavaCourseFactory extends CourseFactory {
    public Course getCourse() {
        return new JavaCourse();
    }
}
