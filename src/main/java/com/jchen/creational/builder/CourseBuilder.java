package com.jchen.creational.builder;

public abstract class CourseBuilder {
    abstract void buildCourseName(String courseName);
    abstract void buildCourseVideo(String courseVideo);
    abstract void buildCoursePPT(String coursePPT);
    abstract void buildCourseArticle(String courseArticle);
    abstract void buildCourseQA(String courseQA);

    abstract Course getCourse();
}
