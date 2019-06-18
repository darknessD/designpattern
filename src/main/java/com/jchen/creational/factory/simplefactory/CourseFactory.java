package com.jchen.creational.factory.simplefactory;

public class CourseFactory {

    //这样违背了开闭原则
    public Course getCourse(String type){
        Course course = null;
        if("Java".equals(type)){
            course = new JavaCourse();
        }else if ("Python".equals(type)){
            course = new PythonCourse();
        }
        return course;
    }

    public Course getCourseEnhance(Class clazz){
        Course course = null;
        try {
            course = (Course) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return course;
    }
}
