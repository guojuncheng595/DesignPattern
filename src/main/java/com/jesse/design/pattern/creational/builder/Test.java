package com.jesse.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java",
                "javaPPT",
                "java视频",
                "java手记",
                "java问答");
        System.out.println(course);

    }
}
