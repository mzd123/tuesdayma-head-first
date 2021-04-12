package com.tuesdayma.headfirst.singleton;

/**
 * @Author mazhoudi
 * @Date 2021/4/8 7:50 下午
 */
public class Singleton1 {
    /**
     * 优点：简单明了
     * 缺点：在项目启动的时候就new了一个对象，都还不知道后面需要需要用到，有点浪费资源
     */
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.err.println(Singleton1.getInstance().hashCode());
        }
    }
}
