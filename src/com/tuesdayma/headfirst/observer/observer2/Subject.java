package com.tuesdayma.headfirst.observer.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: mzd
 * @date: 2021-04-14 20:46
 **/
public interface Subject {
    /**
     * 订阅者列表
     */
    List<Observer> list = new ArrayList<>();

    /**
     * 增加订阅者
     *
     * @param observer
     * @return
     */
    boolean addObserver(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer
     * @return
     */
    boolean removeObserver(Observer observer);

    /**
     * 通知订阅者
     */
    void notifyObserver();
}
