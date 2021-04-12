package com.tuesdayma.headfirst.strategy.headfirst;

/**
 * @Author mazhoudi
 * @Date 2021/4/9 10:55 上午
 */
public class StrategyHeadFirst {

    /**
     * 平时我们需要if else来判断进行不通的业务逻辑处理
     */


    public static void pay(String orderNO, StrategyInterface strategyInterface) {
        strategyInterface.pay(orderNO);
    }

    public static void main(String[] args) {
        pay("1", new WxStrategyImpl());
    }
}
