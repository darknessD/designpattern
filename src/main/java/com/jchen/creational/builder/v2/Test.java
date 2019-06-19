package com.jchen.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java").buildCourseVideo("Java Videe")
                .buildCoursePPT("JavaPPT").buildCourseArticle("JavaArticle").buildCourseQA("JavaQA").build();
        System.out.println(course);
    }
}
