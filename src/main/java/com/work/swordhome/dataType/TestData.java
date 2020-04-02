package com.work.swordhome.dataType;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @auther: weidong.han
 * @date: 2020/1/28
 */
public class TestData {

    public static void main(String[] args) {
        List list = Lists.newArrayList();
        List list1 = Lists.newArrayList(1,2,3,4,5);
        Set hashSet  = new HashSet<>();

        Student s = new Student("weidong",31);
        long listInsertStart = System.currentTimeMillis();
        for (int i=0;i<10000000;i++){
            list.add(new Student("weidong",i));

        }
        System.out.println("list append time :" + (System.currentTimeMillis() - listInsertStart));


        long listStart = System.currentTimeMillis();
        if (list.contains(s)){
            System.out.print("list time:");
        }
//        Iterator listIterator = list.iterator();
//        while (listIterator.hasNext()){
//            Student student =  (Student) listIterator.next();
//        }
        System.out.println("set find a element time:" + (System.currentTimeMillis()-listStart));
        long setInsertStart = System.currentTimeMillis();
        for (int i=0;i<10000000;i++){
            hashSet.add(new Student("weidong",i));

        }
        System.out.println("set append time :" + (System.currentTimeMillis() - setInsertStart));
        long setStart = System.currentTimeMillis();
        if (hashSet.contains(s)){
            System.out.print("set time:");
        }
//        Iterator setIterator = hashSet.iterator();
//        while (setIterator.hasNext()){
//            Student student =  (Student) setIterator.next();
//        }
        System.out.println("set find a element time:" + (System.currentTimeMillis()-setStart));

        long listAddSingleElementStart = System.currentTimeMillis();
        list.add(100,new Student("insert",100));
        System.out.println(System.currentTimeMillis() - listAddSingleElementStart);
        long setAddSingleElementStart = System.currentTimeMillis();
        hashSet.add(new Student("insert",100));
        System.out.println(System.currentTimeMillis() - setAddSingleElementStart);

    }
}

class Student{

    String name;
    int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}