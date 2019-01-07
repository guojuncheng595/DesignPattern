package com.jesse.design.dependenceinversion;

public class Test {
    //v1
    //    public static void main(String[] args) {
//        Jesse jesse = new Jesse();
//        jesse.studyJavaCourse();
//        jesse.studyFECourse();
//
//    }

    //v2
//    public static void main(String[] args) {
//        Jesse jesse = new Jesse();
//        jesse.studyImoocCourse(new JavaCourse());
//        jesse.studyImoocCourse(new FECourse());
//        jesse.studyImoocCourse(new PythonCourse());
//
//    }

    //v3
//    public static void main(String[] args) {
//        Jesse jesse = new Jesse(new JavaCourse());
//        jesse.studyImoocCourse();
//
//    }


    //v4
    public static void main(String[] args) {
        Jesse jesse = new Jesse();
        jesse.setiCourse(new JavaCourse());
        jesse.studyImoocCourse();


        jesse.setiCourse(new FECourse());
        jesse.studyImoocCourse();



    }

}
