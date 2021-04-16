package com.tuesdayma.headfirst.decorator.decorator2;


/**
 * @Author mazhoudi
 * @Date 2021/4/16 2:02 下午
 */
public class EggDecorator extends FoodDecorator {

    public EggDecorator(Food food) {
        super(food);
    }

    @Override
    public String describe() {
        return "一个鸡蛋" + food.describe();
    }

    @Override
    public Double getPrice() {
        return 2.0 + food.getPrice();
    }
}
