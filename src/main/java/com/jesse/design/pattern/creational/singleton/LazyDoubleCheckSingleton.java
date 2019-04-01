package com.jesse.design.pattern.creational.singleton;

/**
 * @author Jesse Guo
 * @Title: LazyDoubleCheck
 * @ProjectName design_course
 * @Description: 懒汉模式 -- Double Check
 * @date 2019/4/116:09
 */
public class LazyDoubleCheckSingleton {

    //volatile 设置线程安全的初始化实例
    //          所有线程都可以看到共享内存的执行状态
    //          保障了内存的可见性
    //          volatile修饰的，在进行写操作的时候，会多出一些汇编代码，
    //          起到两个作用， 1.是将当前处理器，缓存行的数据写回到系统内存，(会使在其他cpu缓存缓存了，该内存行地址的数据无效
    //                       2.因为其他cpu内存的缓存无效了，所以又从共享内存同步数据，保障了内存的可见性）
    //                      3.使用了缓存一致性协议，cpu的缓存无效了，又会从系统缓存中读取到cpu中）
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        //写法3
        //Double check的优点，（1）第一次如果并发比较多，只能创建一个线程，并在这个线程中会再次判断，
        //（2） 如果实例别创建了，之后的再次调用不在调用异步锁
        if (lazyDoubleCheckSingleton == null) {//引起线程不安全，线程有指向内存空间，线程没有初始化
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚分配的内存地址
                    //2和3 可能重排序。
                    //intra-thread semantics 保证重排序，不会改变单线程内的程序执行结果，2和3改变不会改变顺序，不会影响程序执行结果
                }
            }
            lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
        }
        return lazyDoubleCheckSingleton;
    }
}
