package com.tuesdayma.headfirst.decorator.decorator1;

/**
 * @Author mazhoudi
 * @Date 2021/4/16 2:03 下午
 */
public class PorkChop implements Food {
    @Override
    public String describe() {
        return "一块大排";
    }

    @Override
    public Double getPrice() {
        return 8.0;
    }
}
