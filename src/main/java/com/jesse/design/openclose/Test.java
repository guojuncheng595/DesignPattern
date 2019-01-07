package com.jesse.design.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(99, " java开发", 348d);
        System.out.println(" 课程ID：" + javaCourse.getId() + " 课程名称：" + javaCourse.getName() + " 课程价格：" + javaCourse.getPrice());

        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(99, " java开发", 348d);
        System.out.println("课程ID：" + javaDiscountCourse.getId() + " 课程名称：" + javaDiscountCourse.getName() +
                " 课程价格：" + javaDiscountCourse.getOriginPrice() + " 折后价格：" + javaDiscountCourse.getPrice());

    }
}
