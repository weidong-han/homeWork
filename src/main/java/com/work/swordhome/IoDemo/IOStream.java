package com.work.swordhome.IoDemo;

import java.io.FileInputStream;

/**
 * @auther: weidong.han
 * @date: 2020/3/8
 */
public class IOStream {
    public static void main(String[] args) {

    }

    public static void readerNumDemo()throws Exception{
        FileInputStream inputStream = new FileInputStream("");
        //得到文件的字符个数，包括换行符。可以根据此长度定义缓冲区大小，这样可以一次读出
        //如果无法判断出文件的大小，这个不建议使用
        int num = inputStream.available();
        System.out.println(num);
        //num返回的是这个字符的数字表示形式，可强转为char类型
        byte[] buf =new byte[num];
        inputStream.read(buf);
        System.out.println(new String(buf,0,buf.length));

    }
    public static void readerDemo()throws Exception{
        FileInputStream inputStream = new FileInputStream("");
        int num ;
        //num返回的是这个字符的数字表示形式，可强转为char类型
        while ((num = inputStream.read())!=-1){
            System.out.println((char)num);
        }
    }
    public static void readerArrDemo()throws Exception{
        FileInputStream inputStream = new FileInputStream("");
        byte[] buf =new byte[1024];
        int num ;
        //num返回的是读取的数量，-1则表示读完
        while ((num = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,buf.length));
        }
    }
}