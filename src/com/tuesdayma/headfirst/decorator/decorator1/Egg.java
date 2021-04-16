package com.tuesdayma.headfirst.decorator.decorator1;

/**
 * @Author mazhoudi
 * @Date 2021/4/16 2:02 下午
 */
public class Egg implements Food {
    @Override
    public String describe() {
        return "一个鸡蛋";
    }

    @Override
    public Double getPrice() {
        return 2.0;
    }
}
