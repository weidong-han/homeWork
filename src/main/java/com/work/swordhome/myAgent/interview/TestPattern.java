package com.work.swordhome.myAgent.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: weidong.han
 * @date: 2020/1/2
 */
public class TestPattern {
    public static void main(String[] args) {
        String old1 = "&&11";
        //将不在hao字符串中的字符获取出来
        String reg1 = "[^a-z0-9]";
        Pattern pattern1 = Pattern.compile(reg1);
        Matcher matcher1 = pattern1.matcher(old1);
        //全匹配上返回true，其他返回false
        System.out.println(matcher1.matches());
        //将匹配到的数替换为空字符串
        System.out.println(matcher1.replaceAll(""));

        String a = "abdsaj%^&112";
        Pattern p1 = Pattern.compile("[[^a-z][0-9]%^&*(]");
        Matcher m1= p1.matcher(a);
        System.out.println("======="+m1.replaceAll(""));
        System.out.println(old1.matches("[^a-z]"));

//        String str = "agx";
//        Pattern p = Pattern.compile("[abc][edgf][xzy]");
//        Matcher m = p.matcher(str);
//        boolean b = m.matches();
//        System.out.println(b);
//        System.out.println(str.matches("[abc][edgf][xzy]"));


        //System.out.println(Pattern.matches("[abc][edgf][xzy]","agx"));
        //System.out.println(Pattern.matches("^[0-9]+a*","111aaaa"));
        //System.out.println(Pattern.matches("-?[0-9]+(\\.[0-9]+)?","-100333"));
        System.out.println("abc0".matches("[a-z0-9A-Z]+"));
        System.out.println(Pattern.matches("[a-z0-9A-Z]","abc0"));
        String emailReg = "^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
        System.out.println("weidong.han_001@163.com".matches(emailReg));
    }

}