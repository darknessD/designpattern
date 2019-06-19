package com.jchen.creational.builder.v2;

public class Course {
    private String courseName;
    private String courseVideo;
    private String coursePPT;
    private String courseArticle;
    private String courseQA;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
    private Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.courseVideo = courseBuilder.courseVideo;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
    }

    public static class CourseBuilder{
        //静态内部类中无法访问内部类外的变量
        private String courseName;
        private String courseVideo;
        private String coursePPT;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName){
            this.courseName  = courseName;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
