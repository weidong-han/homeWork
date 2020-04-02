package com.work.swordhome.PatternDemo;




import java.util.TreeSet;

/**
 * @auther: weidong.han
 * @date: 2020/2/18
 * 将一组IP进行排序
 */
public class IpPattern {
    public static void ipSort(){
        String ip = "192.168.1.10 102.14.23.102 2.2.2.2";
        ip = ip.replaceAll("(\\d+)","00$1");//有一个或者多个的数字组替换成00加上这个组，说白了就是在这个组前加两个0
        System.out.println(ip);
        ip = ip.replaceAll("0*(\\d{3})","$1");//有0个或者多个0，后边跟3位数字为一组，说白了就是去掉超过3位的数字组就去掉前边的0
        System.out.println(ip);
        String [] arr = ip.split(" ");
        TreeSet<String> treeSet = new TreeSet();
        for(String s:arr){
            treeSet.add(s);
        }
        for(String s:treeSet){
            System.out.println(s.replaceAll("0*(\\d+)","$1"));
        }
    }
    public static void main(String[] args) {
        ipSort();
    }

}