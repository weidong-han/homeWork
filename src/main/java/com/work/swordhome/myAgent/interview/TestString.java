package com.work.swordhome.myAgent.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: weidong.han
 * @date: 2019/12/17
 */
public class TestString {

    public static void main(String[] args) {

        //System.out.println(lengthOfLongestSubstring("aabcdaa"));
        //System.out.println(getStr("aabbeccccd"));

        //System.out.println(getSingle("aabbeccccd"));
        //System.out.println(get("aabcsasc"));
        String s = "aabcsasc";
        //A.indexOf(B)可以判断B是否存在A中，不存在返回-1，存在返回B的长度
        System.out.println(s.indexOf("cua") != -1);

    }

    public static String get(String s){
        StringBuffer buffer = new StringBuffer();
        for (int i=0 ;i<s.length()-1;i++){
            Character character = s.charAt(i);
            for (int j = i+1;j<s.length();j++){
                if (character == s.charAt(j)) {
                    if (j-i == 1){
                        break;
                    }
                    buffer.append(moveRepeat(s.substring(i+1,j))).append(" ");
                }
            }
        }
        return buffer.toString();
    }

    public static String moveRepeat(String s){
        String string = "";
        for (Character character : s.toCharArray()){
            if (!string.contains(character.toString())) {
                string += character;
            }
        }
        return string;
    }

    /**
     * 将一个字符串中的重复字符去掉
     * @param str
     * @return
     */
    public static String getSingle(String str){
        String string = "";
        for (int i=0;i<str.length();i++){
            String s = String.valueOf(str.charAt(i));
            if (string.contains(s)) {
                continue;
            }
            string += s;
        }
        return string;
    }
/**
 * aabbeccccd 转换成2a2b1e4c1d
 */
    public static String getStr(String str){
        String string = "";
        for (int i =0;i<str.length();i++){
            char a = str.charAt(i);
            int count = 1;
            for (int j =i+1;j<str.length();j++){
                if (a == str.charAt(j)) {
                    count +=1;
                    i = j;
                }else {
                    break;
                }
            }
            string = string + count + a;
        }
        return string;
    }
    /**
     * 给定一个字符串求出字符不重复的子串的最大长度
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        //这里初始化是1而不是0，因为比较的时候肯定里边是至少有一个的
        int maxCount = 1;
        String maxStr = "";
        for (int i=0;i<s.length();i++){
            /* 这里如果需要子串则不能使用set集合，因为set会自动进行排序，
              如果不需要子串，只是输出子串的大小则无所谓 */
            List<Character> set = new ArrayList<>();
            set.add(s.charAt(i));
            for (int j=i+1;j<s.length();j++){
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));

                }else {
                    break;
                }
            }
            if (maxCount < set.size()){
                maxCount = set.size();
                maxStr = set.toString();
            }
        }
        System.out.println(maxStr);
        return maxCount;
    }
}