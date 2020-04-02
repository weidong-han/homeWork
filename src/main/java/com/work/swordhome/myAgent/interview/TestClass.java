package com.work.swordhome.myAgent.interview;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @auther: weidong.han
 * @date: 2019/12/19
 */
public class TestClass {
    public static void main(String[] args) throws Exception {
        Test01 test01 = new Test01();
        Class classes = test01.getClass();
        Method b = classes.getMethod("t",String.class);
        b.invoke(test01,"x");
//        getArr(classes.getFields());
//        getArr(classes.getDeclaredFields());
        //getArr(classes.getMethods());
        //getArr(classes.getDeclaredMethods());

//        Class cl = Class.forName("com.work.swordhome.myAgent.interview.Test01");
//        Method a = cl.getDeclaredMethod("t",String.class);
//        a.invoke(cl.newInstance(),"");
    }

    public static void getArr(Field[]arr){

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i].getName());
        }

    }
    public static void getArr(Method[]arr){

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i].getName());
        }

    }

}

class Test01{
    private int an = 100;
    public String string = "public";

    private void f(String s){
        System.out.println("this is private method");
    }
    public void t(String string){
        System.out.println("this is public method");
    }

}