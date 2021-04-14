package com.tuesdayma.headfirst.observer.observer2;

/**
 * @author: mzd
 * @date: 2021-04-14 20:30
 **/
public class WeatherStation implements Subject {
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
        notifyObserver();
    }

    @Override
    public boolean addObserver(Observer observer) {
        this.list.add(observer);
        return true;
    }

    @Override
    public boolean removeObserver(Observer observer) {
        if (this.list.contains(observer)) {
            this.list.remove(observer);
        }
        return true;
    }

    @Override
    public void notifyObserver() {
        this.list.forEach(observer -> {
            observer.hear(this.temperature, this.windSpeed);
        });
    }
}
