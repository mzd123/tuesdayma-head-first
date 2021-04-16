package com.tuesdayma.headfirst.decorator.decorator2;

/**
 * @Author mazhoudi
 * @Date 2021/4/16 2:00 下午
 */
public class TestDriver {
    public static void main(String[] args) {
        //老板，我要一碗清汤面
        Food food = new Noodle();
        System.out.println(food.describe()+"价格为："+food.getPrice());
        //老板再给我价格鸡蛋
        food = new EggDecorator(food);
        System.out.println(food.describe()+"价格为："+food.getPrice());
        //老板再给我加个大排
        food = new PorkChopDecorator(food);
        System.out.println(food.describe()+"价格为："+food.getPrice());
    }
}
