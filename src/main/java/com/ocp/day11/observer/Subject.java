package com.ocp.day11.observer;

// 被觀察者(主題)
public interface Subject {
    void add(Observer observer); // 觀察者加入訂閱
    void remove(Observer observer); // 觀察者取消訂閱
    void notifyObserver(String message); // 通知觀察者
}
