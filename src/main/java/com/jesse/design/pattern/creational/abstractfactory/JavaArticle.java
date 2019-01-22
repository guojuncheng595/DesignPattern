package com.jesse.design.pattern.creational.abstractfactory;

public class JavaArticle  extends Article {
    @Override
    public void produce() {
        System.out.println("生成java手记信息");
    }
}
