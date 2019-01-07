package com.jesse.design.composite;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux", 100);
        CatalogComponent windowsCourse = new Course("windows", 200);


        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录", 2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("设计模式", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
