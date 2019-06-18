package com.jchen.creational.factory.factorymethod;

public class PythonCourseFactory extends CourseFactory {
    public Course getCourse() {
        return new PythonCourse();
    }
}
