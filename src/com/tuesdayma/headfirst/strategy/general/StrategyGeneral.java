package com.tuesdayma.headfirst.strategy.general;

/**
 * @Author mazhoudi
 * @Date 2021/4/9 10:55 上午
 */
public class StrategyGeneral {

    /**
     * 平时我们需要if else来判断进行不通的业务逻辑处理
     */


    public static void pay(String orderNO, String payType) {
        if ("wx".equals(payType)) {
            System.out.println(orderNO + "是使用微信支付");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("微信支付业务处理成功");
        } else if ("ali".equals(payType)) {
            System.out.println(orderNO + "是使用支付宝支付");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("支付宝支付业务处理成功");
        }
    }

    public static void main(String[] args) {
        pay("1", "wx");
    }
}
