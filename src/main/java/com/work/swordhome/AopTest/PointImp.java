package com.work.swordhome.AopTest;

import org.springframework.stereotype.Service;

/**
 * @auther: weidong.han
 * @date: 2020/1/6
 */
@Service
public class PointImp {

    public String testPoint(String name,int age){
        System.out.println("test point method");
        return name;
    }

    public void testPoint02(String name){
        System.out.println("test && args");
    }

    public static void main(String[] args) {
        PointImp pointImp = new PointImp();
        pointImp.testPoint("weidong",31);
        System.out.println("__________============");
        pointImp.testPoint02("weidong");
    }

}