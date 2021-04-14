package com.tuesdayma.headfirst.observer.observer2;

/**
 * @author: mzd
 * @date: 2021-04-14 20:46
 **/
public interface Observer {
    /**
     * 得知天气预报的能力
     *
     * @param temperature
     * @param windSpeed
     */
    void hear(String temperature, String windSpeed);
}
