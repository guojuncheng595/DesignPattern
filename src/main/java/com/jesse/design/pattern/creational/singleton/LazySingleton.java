package com.jesse.design.pattern.creational.singleton;

/**
 * 懒汉模式
 *
 * private
 * 延迟加载
 * 线程不安全
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}