package com.jchen.creational.builder;

public class Coach {

    private CourseBuilder courseBuilder;

    public Coach(CourseBuilder courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String courseVideo, String coursePPT, String courseArticle,
                             String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.getCourse();
    }
}
