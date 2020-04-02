package com.work.swordhome.myAgent;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @auther: weidong.han
 * @date: 2019/12/20
 */
public class Testlist {

    public static void main(String[] args) {
        List a = new ArrayList<>();
        List b = new ArrayList<>();
        String s = "";
        a.add("a");a.add("b");a.add("c");
        b.add("a");b.add("b");b.add("c");
        System.out.println(a.equals(b));
        System.out.println(listTest01(a,b));
        System.out.println(listTest01(b,a));


    }
    public static boolean listTest(List a,List b){
        if (a==b) {
            return true;
        }
        if (a.size() == b.size()&&a.containsAll(b)){
            return true;
        }
        return false;
    }

    public static List listTest01(List a,List b){
        List end = new ArrayList<>();
        Iterator iterator = a.iterator();
        while (iterator.hasNext()){
            Object o = (Object)iterator.next();
            if (!b.contains(o)) {
                end.add(o);
            }
        }
        return end;
    }


}