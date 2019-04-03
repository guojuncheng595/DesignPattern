package com.jesse.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉模式
 *
 * private
 * 延迟加载
 * 线程不安全
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
//    private static boolean flag = true;
    private LazySingleton(){
//        if (flag) {
//            flag = false;
//        } else {
//            throw new RuntimeException("单利构造器禁止反射调用");
//        }
        if (lazySingleton != null) {
            throw new RuntimeException("单利构造器禁止反射调用");
        }
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

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);
        LazySingleton o1 = LazySingleton.getInstance();

        //破坏返利机制
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);

        LazySingleton o2 = (LazySingleton) c.newInstance();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);

    }
}
