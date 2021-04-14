package com.tuesdayma.headfirst.observer.observer1;

/**
 * @author: mzd
 * @date: 2021-04-14 20:30
 **/
public class WeatherStation {
    /**
     * 温度
     */
    private String temperature;
    /**
     * 风速
     */
    private String windSpeed;

    /**
     * 气象站有感知天气变化的能力
     */
    public void perceptionOfChange(String temperature, String windSpeed) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        //通知用户
        User1 user1 = new User1();
        user1.hear(temperature, windSpeed);
        User2 user2 = new User2();
        user2.hear(temperature, windSpeed);
    }
}
