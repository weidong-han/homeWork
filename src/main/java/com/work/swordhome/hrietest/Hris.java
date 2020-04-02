package com.work.swordhome.hrietest;

/**
 * @auther: weidong.han
 * @date: 2020/2/24
 */
public class Hris {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        String a = "测试指标说明和衡量标准的长度大于500";
        while (buffer.length()<505){
            buffer.append(a);
        }
        System.out.println(buffer.toString());
    }

}