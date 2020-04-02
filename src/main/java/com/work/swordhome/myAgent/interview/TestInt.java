package com.work.swordhome.myAgent.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: weidong.han
 * @date: 2019/12/31
 */
public class TestInt {

    public static void main(String[] args) {
//        getThreeInt();
//        int[] arr1 = {1,2,10,19};
//        int[] arr2 = {2,6,8,9};
//        joinArr(arr1,arr2);
        String s = "ababababacdccddaaabbccad";
        System.out.println(endString(s));
        //System.out.println(getMaxDiv(100));
    }

    //水仙花数：三位数，每个位数上的立方之和等于这个三位数
    public static void getThreeInt(){
        int count =0;
        String s = "";
        for (int i =100 ;i<=999;i++){
            int a = i/100;
            int b = (i-a*100)/10;
            int c = i-a*100-b*10;
            int result = a*a*a + b*b*b + c*c*c;
            if (result ==i ){
                count +=1;
                s += result + " ";
            }
        }
        System.out.println(s);
        System.out.println(count);
    }
    //将两个有序的整型数组合并到一起，思路是新建一个数组，对比两个数组的值，把小的放进去
    public static void joinArr(int[]arr1,int[]arr2){
        String s = "";
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1 + len2];
        int a=0 ,b =0,count =0;
        //将小的添加到新数组并右移一位，大的保持指针位置不变
        while (a < len1 && b<len2){
            if (arr1[a] <= arr2[b]){
                arr[count++] =  arr1[a++];
            }
            else if (arr1[a] > arr2[b]){
                arr[count++] =  arr2[b++];
            }
        }
        //如果有一个数组对比完后，将另外一个数组的剩余值全部添加到新数组
        if (a >= len1){
            while (b < len2){
                arr[count++] = arr2[b++];
            }
        }
        else if (b >= len2){
            while (a < len1){
                arr[count++] = arr1[a++];
            }
        }
        for (int i =0 ;i<arr.length;i++){
            s += arr[i] +" ";
        }
        System.out.println(s);
    }

//共求质数调用的函数
    public static boolean div(int n){
        if (n ==1){
            return false;
        }
        for (int i = 2;i<n;i++){
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }
//给定一个n，求不大于n的质数组合，并且求出其中最大的质数
    public static int getMaxDiv(int n){
        if (n <= 1){
            return 0;
        }
        int max = 0;
        String s = "";
        for (int i = 2;i<=n;i++){
            if (div(i)){
                max = i;
                s += i +" ";
            }
        }
        System.out.println(s);
        return max;
    }

//海量数据中有 a b c d 等字符 ,供此题使用
    public static Map<String,Integer> getMap(String s){
        Map<String,Integer> strMap = new HashMap<>();
        for (int i =0;i<s.length();i++){
            String tmp = String.valueOf(s.charAt(i));
            if (!strMap.keySet().contains(tmp)){
                strMap.put(tmp,1);
            }else {
                strMap.put(tmp,strMap.get(tmp)+1);
            }
        }
        return strMap;
    }
//海量数据中有 a b c d 等字符，将这些字符快速归类取出来，按照aaaa bbbb 这种形式，求每个元素出现的个数
    public static String endString(String s){
        Map<String,Integer> strMap = getMap(s);
        String endStr = "";
        String endChar = "";
        int maxCount = 0;
        for (Map.Entry<String,Integer> entry:strMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (maxCount < value){
                maxCount = value;
                endChar = key;
            }
            int i = 0;
            while (i < value){
                endStr += key;
                i++;
            }
        }
        System.out.println("最多的字符是：" + endChar +";"+"次数为："+maxCount);
        return endStr;
    }
}