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

    public synchronized static LazySingleton getInstance() {
        //写法2
        if (lazySingleton == null) {//引起线程不安全
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }



    //方法1：添加关键字
    //所加在静态方法上，相当于锁的是这个类的class文件，
    //如果方法不是静态方法，相当于锁的是在堆内存中生成的对象。
    //写法1 方法1和方法2的写法是一样的
    public /*synchronized*/ static LazySingleton getInstance1() {
        //写法2
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {//引起线程不安全
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
