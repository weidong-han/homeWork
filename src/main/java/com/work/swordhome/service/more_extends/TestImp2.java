package com.work.swordhome.service.more_extends;

import org.springframework.stereotype.Service;

/**
 * @auther: weidong.han
 * @date: 2020/1/7
 */
@Service
public class TestImp2 extends TestAB{

    @Override
    public void eat(String name) {
        super.move(name);
        System.out.println("TestImp2===========");
    }

}