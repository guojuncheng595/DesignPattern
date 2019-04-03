package com.jesse.design.pattern.creational.singleton;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

/**
 * @author Jesse Guo
 * @Title: HungrySingleton
 * @ProjectName design_course
 * @Description: 单利模式--饿汉
 * @date 2019/4/210:08
 */
public class HungrySingleton implements Serializable {

    /**
     * 类加载的时候就初始化, final 不可更改
     * 声明为final的变量必须在类加载完成时，就已经赋值
     */
    private final static HungrySingleton hungrySingleton;

    /**
     * 类实例化的过程，放在静态块中，
     * 类加载的时候也会初始化静态代码块
     */
    static{
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }

}
