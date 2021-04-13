package com.tuesdayma.headfirst.strategy.strategy3;

/**
 * @author: mzd
 * @date: 2021-04-13 20:22
 **/
public class DuckB implements Duck {
    private SwimAble swimAble;

    public DuckB(SwimAble swimAble) {
        this.swimAble = swimAble;
    }

    @Override
    public void display() {
        System.out.println("display bbbbb");
    }

    @Override
    public void swim() {
        swimAble.swim();
    }

}
