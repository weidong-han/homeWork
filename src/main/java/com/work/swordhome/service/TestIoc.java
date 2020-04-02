package com.work.swordhome.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @auther: weidong.han
 * @date: 2020/1/7
 */
@Service
@Lazy(false)
@Scope(value = "singleton")
public class TestIoc {

    public TestIoc(){
        System.out.println("spring初始化创建对象！==========================================");
        try {
            Class cl = Class.forName("com.work.swordhome.service.TestIoc");
            System.out.println(cl);
        } catch (ClassNotFoundException e) {

        }
    }

    public static void main(String[] args) {
        TestIoc t1 = new TestIoc();
        TestIoc t2 = new TestIoc();
        System.out.println(t1 == t2);
    }

}