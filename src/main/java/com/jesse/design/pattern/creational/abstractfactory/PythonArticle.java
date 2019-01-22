package com.jesse.design.pattern.creational.abstractfactory;

public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("生成Python的手记");
    }
}
