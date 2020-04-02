package com.work.swordhome.myAgent.interview;

/**
 * @auther: weidong.han
 * @date: 2019/12/27
 */
public class TestSingle2 {
    private static TestSingle2 single2 = new TestSingle2();
    private TestSingle2(){}
    public static TestSingle2 getSingle2(){
        return single2;
    }
}