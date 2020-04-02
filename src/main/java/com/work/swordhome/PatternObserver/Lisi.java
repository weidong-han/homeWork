package com.work.swordhome.PatternObserver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: weidong.han
 * @date: 2020/2/11
 */
//李四和张三作为具体的观察者进行实现
public class Lisi implements Human {
    @Override
    public void doSomething(String message) {
        if (equalsPattern(message)) {
            System.out.println("李四中奖了！");
        }else {
            System.out.println("李四没有中奖！");
        }
    }

    public boolean equalsPattern(String message){
        Pattern pattern = Pattern.compile("[12]\\t[25]\\t[1]\\t[4]\\t[23]\\t[06]");
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }
}