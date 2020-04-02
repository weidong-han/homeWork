package com.work.swordhome.PatternObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: weidong.han
 * @date: 2020/2/11
 */
//被观察者实现类
public class LuckySubjectImpl implements LuckySubject {
    //添加私有变量用来存储观察者
    private List<Human> humanList;
    //构造方法初始化存储
    public LuckySubjectImpl(){
        humanList = new ArrayList<>();
    }
    //将观察者注册存储
    @Override
    public void registerObserver(Human human) {
        humanList.add(human);
    }
    //将观察者从存储中去掉
    @Override
    public void remove(Human human) {
        if (humanList.size() != 0) {
            humanList.remove(human);
        }
    }
    //消息发生变化回调观察者的doSomething方法，实现通知的目的
    @Override
    public void notifyObserver(String message) {
        humanList.forEach(human -> human.doSomething(message));
    }
    //测试类
    public static void main(String[] args) {
        LuckySubjectImpl subject = new LuckySubjectImpl();
        //这里需要手动注册，如果增加新的human实现类就需要手动添加
        subject.registerObserver(new Lisi());
        subject.registerObserver(new Zhangsan());
        String message = "12 25 1 4 23 06";
        subject.notifyObserver(message);
    }
}