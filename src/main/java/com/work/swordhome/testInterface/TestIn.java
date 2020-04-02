package com.work.swordhome.testInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: weidong.han
 * @date: 2020/1/14
 */
public class TestIn implements TestInterface{

    public static void main(String[] args) {
        TestInterface.reStr();
        System.out.println(TestInterface.name);
        TestIn in = new TestIn();
        in.def();
        System.out.println(2<<1);
        System.out.println(-8>>>1);
        System.out.println(-8>>1);
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher("69");
        System.out.println(matcher.replaceAll("."));
    }

    @Override
    public void def() {
        System.out.println("this is override default method from father");
    }

    @Override
    public void adstractMethod() {
        System.out.println("this is a override");
    }
}