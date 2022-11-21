package com.ocp.day11.observer;

import java.util.ArrayList;
import java.util.List;

// 新聞主題
public class NewsSubject implements Subject {
    // 收集所有訂閱者
    private List<Observer> list = new ArrayList<>();
    
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for(Observer observer : list) {
            observer.update(message);
        }
    }
    
}
