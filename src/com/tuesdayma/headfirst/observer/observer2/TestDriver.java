package com.tuesdayma.headfirst.observer.observer2;

/**
 * @author: mzd
 * @date: 2021-04-14 20:39
 **/
public class TestDriver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        User1 user1 = new User1();
        weatherStation.addObserver(user1);
        User2 user2 = new User2();
        weatherStation.addObserver(user2);
        weatherStation.removeObserver(user1);
        weatherStation.perceptionOfChange("28", "2级");
    }
}
