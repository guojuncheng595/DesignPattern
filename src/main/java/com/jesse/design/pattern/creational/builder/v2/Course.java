package com.jesse.design.pattern.creational.builder.v2;

public class Course {
    private String courseName;
    private String CoursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;


    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
        this.courseVideo = courseBuilder.courseVideo;
        this.CoursePPT = courseBuilder.CoursePPT;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", CoursePPT='" + CoursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }



    public static class CourseBuilder{
        private String courseName;
        private String CoursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }


        public CourseBuilder buildCoursePPT(String CoursePPT) {
            this.CoursePPT = CoursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }
}
