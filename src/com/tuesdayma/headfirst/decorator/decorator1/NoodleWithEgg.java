package com.tuesdayma.headfirst.decorator.decorator1;

/**
 * @Author mazhoudi
 * @Date 2021/4/16 11:07 上午
 */
public class NoodleWithEgg implements Food {

    @Override
    public String describe() {
        return "清汤面+鸡蛋";
    }

    @Override
    public Double getPrice() {
        return 5.5 + 2;//2块鸡蛋的钱
    }
}
