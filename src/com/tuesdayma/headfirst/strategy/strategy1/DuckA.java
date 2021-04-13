package com.tuesdayma.headfirst.strategy.strategy1;

/**
 * @author: mzd
 * @date: 2021-04-13 20:22
 **/
public class DuckA implements Duck {
    @Override
    public void display() {
        System.out.println("display aaaaa");
    }

    @Override
    public void swim() {
        System.out.println("swim aaaaa");
    }
}
