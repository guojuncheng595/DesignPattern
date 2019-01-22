package com.jesse.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java 精讲")
                .buildCourseArticle("java手记").buildCoursePPT("javaPPT")
                .buildCourseQA("java 1").buildCourseVideo("java视频")
                .build();
        System.out.println(course);

        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(set);
    }
}
