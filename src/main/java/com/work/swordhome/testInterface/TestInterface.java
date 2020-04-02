package com.work.swordhome.testInterface;

/**
 * 类名称:TestInterface
 * 类描述:TODO
 * 创建人:weidong.han
 * 创建时间:2020/1/14 9:30
 * Version 1.0
 */

public interface TestInterface {

    String name = "hello";
    default void def(){
        System.out.println("this is a default method,begin jkd8");
    }

    static String reStr(){
        System.out.println("this is interface static method in jdk8");
        return "";
    }

    void adstractMethod();

    /*private void privateM(){
        jdk9以后新增了private和private static方法
    }

    private static void privateM(){

    }*/
}
