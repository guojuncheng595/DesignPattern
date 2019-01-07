package com.jesse.design.dependenceinversion;

public class Jesse {

    public ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

//    public Jesse() {
//        this.iCourse = iCourse;
//    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }


//    public void studyImoocCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }
}
