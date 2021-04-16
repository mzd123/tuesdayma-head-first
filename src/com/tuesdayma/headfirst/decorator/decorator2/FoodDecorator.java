package com.tuesdayma.headfirst.decorator.decorator2;

/**
 * @Author mazhoudi
 * @Date 2021/4/16 1:50 下午
 */
public abstract class FoodDecorator implements Food {
    protected Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }
}
