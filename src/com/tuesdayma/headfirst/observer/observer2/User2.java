package com.tuesdayma.headfirst.observer.observer2;

/**
 * @author: mzd
 * @date: 2021-04-14 20:33
 **/
public class User2 implements Observer {
    /**
     * 用户有从气象站得知天气的能力
     */
    public void hear(String temperature, String windSpeed) {
        System.out.println("user2 得知天气发生了变化，当前temperature：" + temperature + "，windSpeed：" + windSpeed);
    }
}
