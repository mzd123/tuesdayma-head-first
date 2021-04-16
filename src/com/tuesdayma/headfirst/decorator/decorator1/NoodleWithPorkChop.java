package com.tuesdayma.headfirst.decorator.decorator1;

/**
 * @Author mazhoudi
 * @Date 2021/4/16 11:17 上午
 */
public class NoodleWithPorkChop implements Food {

    @Override
    public String describe() {
        return "清汤面+大排";
    }

    @Override
    public Double getPrice() {
        return 5.5 + 8;//8块大排的钱
    }
}
