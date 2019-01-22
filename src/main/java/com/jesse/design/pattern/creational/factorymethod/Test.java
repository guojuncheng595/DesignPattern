package com.jesse.design.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory feVideoFactory = new FEVideoFactory();
        VideoFactory python = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();


    }
}
