package com.tuesdayma.headfirst.decorator.decorator2;


/**
 * @Author mazhoudi
 * @Date 2021/4/16 11:06 上午
 */
public class Noodle implements Food {


    @Override
    public String describe() {
        return "清汤面";
    }

    @Override
    public Double getPrice() {
        return 5.5;
    }
}
