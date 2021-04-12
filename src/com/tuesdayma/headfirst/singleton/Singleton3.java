package com.tuesdayma.headfirst.singleton;

import java.lang.reflect.Constructor;

/**
 * @Author mazhoudi
 * @Date 2021/4/8 7:50 下午
 * 严格意义上来讲，只有枚举的单例才是真正的单例模式
 * 其他的单例模式都可以通过反射调用构造方法来获取对象，但是枚举没有构造方法
 */
public enum Singleton3 {
    SINGLETON3;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            System.err.println(Singleton3.SINGLETON3.hashCode());
        }
        Singleton3.SINGLETON3.doTest();


        Constructor c1 = Singleton1.class.getDeclaredConstructor();
        c1.setAccessible(true);
        Singleton1 singleton1 = (Singleton1) c1.newInstance();
        System.err.println(singleton1.hashCode());
        System.err.println(Singleton1.getInstance().hashCode());

        /**
         * 会抛异常：java.lang.NoSuchMethodException
         */
        Constructor c3 = Singleton3.class.getDeclaredConstructor();
        c3.setAccessible(true);
        Singleton3 singleton3 = (Singleton3) c3.newInstance();
        System.err.println(singleton3.hashCode());
        System.err.println(Singleton3.SINGLETON3.hashCode());

    }

    public void doTest() {
        System.err.println("11111");
    }
}
