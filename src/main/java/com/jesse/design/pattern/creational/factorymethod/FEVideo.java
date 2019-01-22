package com.jesse.design.pattern.creational.factorymethod;

public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制fe视频！");
    }
}
