package com.work.swordhome.myAgent.mode.impl;

import com.qunar.business.sword.myAgent.mode.modeInterface.Listener;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: weidong.han
 * @date: 2019/12/20
 */
public class ImlTeacher extends AbstarctTeacher {

    private static List<Listener> listeners = new ArrayList<>();


    public ImlTeacher(String type){
       super(type);
    }
    @Override
    public void add(Listener o) {
        this.listeners.add(o);
        System.out.println("注册成功");
    }

    @Override
    public void move(Listener o) {
        this.listeners.remove(o);
        System.out.println("取消注册");
    }

    @Override
    public void setHomeWork(Listener o) {
        System.out.println(super.getType() +  "老师布置作业开始------");
        o.update();
    }
}