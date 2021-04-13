package com.tuesdayma.headfirst.strategy.strategy2;

/**
 * @author: mzd
 * @date: 2021-04-13 20:22
 **/
public class DuckA implements Duck, SwimAble {
    @Override
    public void display() {
        System.out.println("display aaaaa");
    }

    @Override
    public void swim() {
        System.out.println("swim aaaaa");
    }
}
