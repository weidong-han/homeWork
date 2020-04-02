package com.work.swordhome.myAgent.mode.impl;

import com.qunar.business.sword.myAgent.mode.modeInterface.Listener;

/**
 * @auther: weidong.han
 * @date: 2019/12/20
 */
public class TestMain {
    public static void main(String[] args) {
        AbstarctTeacher teacher = new ImlTeacher("语文");
        Listener listener = new ImpListener("weidong.han",teacher);
        teacher.setHomeWork(listener);
    }

}