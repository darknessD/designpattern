package com.jchen.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        //使用这种方式使类的创建更加清楚
        //在Guava的ImmutableSet中也使用了建造者模式来创建set
        Course course = new Course.CourseBuilder().buildCourseName("Java").buildCourseVideo("Java Videe")
                .buildCoursePPT("JavaPPT").buildCourseArticle("JavaArticle").buildCourseQA("JavaQA").build();
        System.out.println(course);
    }
}
