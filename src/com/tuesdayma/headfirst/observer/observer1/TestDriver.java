package com.tuesdayma.headfirst.observer.observer1;

/**
 * @author: mzd
 * @date: 2021-04-14 20:39
 **/
public class TestDriver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.perceptionOfChange("28", "2级");
    }
}
