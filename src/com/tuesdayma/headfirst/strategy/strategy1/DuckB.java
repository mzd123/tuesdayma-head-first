package com.tuesdayma.headfirst.strategy.strategy1;

/**
 * @author: mzd
 * @date: 2021-04-13 20:22
 **/
public class DuckB implements Duck {
    @Override
    public void display() {
        System.out.println("display bbbbb");
    }

    @Override
    public void swim() {
        System.out.println("swim bbbbb");
    }
}
