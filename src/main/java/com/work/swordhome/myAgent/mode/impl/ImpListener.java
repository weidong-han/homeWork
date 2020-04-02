package com.work.swordhome.myAgent.mode.impl;

import com.qunar.business.sword.myAgent.mode.modeInterface.Listener;

/**
 * @auther: weidong.han
 * @date: 2019/12/20
 */
public class ImpListener implements Listener {
    private AbstarctTeacher teacher;

    private String name;
    public ImpListener(String name, AbstarctTeacher t){
        this.name = name;
        this.teacher =t;
    }

    @Override
    public void update() {
        System.out.println(name + " 收到来自 " + teacher.getType() +"老师的作业");
    }
}