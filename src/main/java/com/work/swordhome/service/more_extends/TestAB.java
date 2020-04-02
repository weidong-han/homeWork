package com.work.swordhome.service.more_extends;


/**
 * @auther: weidong.han
 * @date: 2020/1/7
 */
public abstract class TestAB implements TestMoreExtends {

    private String name;

    @Override
    public void move(String name){
        this.name = name;
        if (name.equals("TestImp1")){
            System.out.println("TestImp1 is running!");
        }else {
            System.out.println("is not TestImp1!");
        }
    }

}