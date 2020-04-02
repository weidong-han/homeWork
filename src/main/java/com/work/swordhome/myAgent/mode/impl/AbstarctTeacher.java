package com.work.swordhome.myAgent.mode.impl;

import com.qunar.business.sword.myAgent.mode.modeInterface.Listener;
import com.qunar.business.sword.myAgent.mode.modeInterface.Teacher;

/**
 * @auther: weidong.han
 * @date: 2019/12/20
 */
public class AbstarctTeacher implements Teacher {

    private String type;
    public AbstarctTeacher(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public void add(Listener o) {

    }

    @Override
    public void move(Listener o) {

    }

    @Override
    public void setHomeWork(Listener o) {

    }
}