package com.work.swordhome.IoDemo;

/**
 * @auther: weidong.han
 * @date: 2020/3/5
 */

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符流和字节流
 * 字节流两个基类：inputStream outputStream
 *
 * 字符流的两个基类：
 * reader write
 */
public class IoDemo01 {
    public static void main(String[] args)throws IOException{
        String s = "D:\\work\\test\\ioTest.txt";
        //这个构造函数会直接创建文件，旧的文件会被删除
        FileWriter writer = new FileWriter(s);
        //这个构造是使用当前的文件并追加内容
        FileWriter appendWrite = new FileWriter(s,Boolean.TRUE);
        //调用write方法将数据写到流中,win中换行需要\n\r,Linux中只需要\n
        writer.write("\n\r" + "aaaaa");
        //将流中的数据写到本地文件中
        //writer.flush();
        //或者直接关闭流也会起到flush的作用,不同的是调用flush的时候并不会关闭流，还是可以继续写入
        writer.close();

        FileReader fileReader =new FileReader(s);
        int i = 0;
        while ((i=fileReader.read())!=-1){
            System.out.println((char)i);
        }
//        int a = 0;
//        char[] buf = new char[2];
//        while ((a = fileReader.read(buf,0,buf.length))!=-1){
//            System.out.println(String.valueOf(buf));
//        }
        fileReader.close();
        pa();
    }

    public static void pa(){
//        String pattern = "ab124";
//        boolean b = pattern.matches("[a-z]*\\d*");
//        System.out.println(b);
        Pattern pattern = Pattern.compile("[a-z]*\\d*");
        Matcher matcher = pattern.matcher("ab124");
        System.out.println(matcher.replaceAll("hello"));
    }

}

/**
 * 文件复制：
 * 1、读取源文件
 * 2、写入新文件
 * 3、关闭流
 */
class CopyFileDemo{
    public static void main(String[] args) {

    }
}

/**
 * 字符串缓冲区
 * bufferedWrite
 * bufferedReader
 * 创建缓冲区的时候必须先有流
 */
class BufferWriteDemo{
    public static void main(String[] args)throws Exception {
        String s = "D:\\work\\test\\ioTest.txt";
        FileWriter fileWriter = new FileWriter(s);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("sss");
        writer.newLine();
        //记得使用缓冲区就必须使用flush刷新
        writer.flush();
        writer.close();
    }
}

class BufferReaderDemo{
    public static void main(String[] args) throws  Exception{
        String s = "D:\\work\\test\\ioTest.txt";
        FileReader reader = new FileReader(s);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line ;
        while ((line =bufferedReader.readLine() )!= null){

        }
    }
}