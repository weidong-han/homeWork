package com.work.swordhome.PatternObserver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: weidong.han
 * @date: 2020/2/11
 */
public class Zhangsan implements Human {
    @Override
    public void doSomething(String message) {
        if (equalsPattern(message)) {
            System.out.println("张三中奖了！");
        }else {
            System.out.println("张三没有中奖！");
        }
    }
    public boolean equalsPattern(String message){
        Pattern pattern = Pattern.compile("12 25 1 4 23 06");
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }
}