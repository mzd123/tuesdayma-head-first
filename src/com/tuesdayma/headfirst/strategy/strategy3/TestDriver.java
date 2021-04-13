package com.tuesdayma.headfirst.strategy.strategy3;

/**
 * @author: mzd
 * @date: 2021-04-13 20:43
 **/
public class TestDriver {
    public static void main(String[] args) {
        DuckA duckA = new DuckA(new Swim1());
        duckA.swim();
    }
}
