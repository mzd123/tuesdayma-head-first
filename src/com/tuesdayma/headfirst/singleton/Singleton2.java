package com.tuesdayma.headfirst.singleton;

/**
 * @Author mazhoudi
 * @Date 2021/4/8 7:50 下午
 */
public class Singleton2 {
    /**
     * 优点：用到了才创建对象，不会造成浪费资源的问题
     * 缺点：
     * 1、有点复杂，需要(double checked locking)
     * 2、虽然能保证得到的对象是单例的，但是有些对象拿到的时候是没有被赋值(jvm创建对象的时候会发生指令重排问题)，
     * 需要加volatile关键字来解决这个问题
     */
    private static volatile Singleton2 singleton;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.err.println(Singleton2.getInstance().hashCode());
        }
    }
}
