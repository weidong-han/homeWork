package com.work.swordhome.PatternObserver;

/**
 * 类名称:LuckySubject
 * 类描述:TODO
 * 创建人:weidong.han
 * 创建时间:2020/2/11 18:54
 * Version 1.0
 */
//创建被观察者的接口
public interface LuckySubject {
    void registerObserver(Human human);
    void remove(Human human);
    void notifyObserver(String message);
}
