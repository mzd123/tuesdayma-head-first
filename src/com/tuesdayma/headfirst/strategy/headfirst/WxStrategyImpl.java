package com.tuesdayma.headfirst.strategy.headfirst;


/**
 * @Author mazhoudi
 * @Date 2021/4/9 11:01 上午
 */
public class WxStrategyImpl implements StrategyInterface {
    @Override
    public void pay(String orderNO) {
        System.out.println(orderNO + "是使用微信支付");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println("微信支付业务处理成功");
    }
}
