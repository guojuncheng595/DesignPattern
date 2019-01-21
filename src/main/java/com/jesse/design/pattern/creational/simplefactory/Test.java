package com.jesse.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        //父类声明了一个引用，执行的子类的实现
//        Video video = new JavaVideo();
//        video.produce();


//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video =  videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();

//        Class.forName("com.mysql.jdbc.Driver");

    }
}
