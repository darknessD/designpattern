package com.jchen.creational.builder;

public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    Course getCourse() {
        return this.course;
    }
}
