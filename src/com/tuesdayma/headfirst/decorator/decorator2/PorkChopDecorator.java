package com.tuesdayma.headfirst.decorator.decorator2;


/**
 * @Author mazhoudi
 * @Date 2021/4/16 2:03 下午
 */
public class PorkChopDecorator extends FoodDecorator {
    public PorkChopDecorator(Food food) {
        super(food);
    }

    @Override
    public String describe() {
        return "一块大排" + food.describe();
    }

    @Override
    public Double getPrice() {
        return 8.0 + food.getPrice();
    }
}
