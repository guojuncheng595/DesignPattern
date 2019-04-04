package com.jesse.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
//
        System.out.println("end");
//------------------------------------------------------------------------
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance == newInstance);

//        ----------------------------------------------

//        Class objectClass = HungrySingleton.class;
//        Class.forName(HungrySingleton.class.getName());
        //目标，通过反射，打开构造器的权限
        //通过权限把这个权限设置为true
        //构造器的权限就放开了
        //
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton object = (HungrySingleton) constructor.newInstance();



//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton object = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton instance = (StaticInnerClassSingleton) constructor.newInstance();


//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(newInstance == instance);


//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance);
//        System.out.println(instance.getData() == newInstance);



//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//
//        constructor.setAccessible(true);
//        EnumInstance enumInstance = (EnumInstance) constructor.newInstance("gjc", 666);

//
//        StaticInnerClassSingleton object = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton instance = (StaticInnerClassSingleton) constructor.newInstance();
//
//
//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();


//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(newInstance == instance);


//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();

    }
}
