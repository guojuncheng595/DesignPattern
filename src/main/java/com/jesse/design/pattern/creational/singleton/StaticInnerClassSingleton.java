package com.jesse.design.pattern.creational.singleton;

/**
 * @author Jesse Guo
 * @Title: StaticInnerClassSingleton
 * @ProjectName design_course
 * @Description: 静态内部类的单利模式 ,延迟加载
 * @date 2019/4/29:41
 */
public class StaticInnerClassSingleton {
    /**
     * innerClass 对象的初始化锁
     */
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    /**
     * 私有的构造器是必须要有的，不然外部就要new出来的
     */
    private StaticInnerClassSingleton() {

    }

    public static void main(String[] args) {
        Long a = 10L;
        Long b = 20L;
        a.equals(b);
    }


}
