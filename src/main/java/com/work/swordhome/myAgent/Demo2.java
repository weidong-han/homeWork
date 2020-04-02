package com.work.swordhome.myAgent;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: weidong.han
 * @date: 2019/11/18
 */
public class Demo2 {
    public static void main(String[] args) {
        //只能取值，不能增加
//        List<? extends Object> list = new ArrayList<String>();
//        //Object string = list.get(1);
//
//        List<? super String> list1 = new ArrayList<>();
//        list1.add(0,"");
//        Object o1 = new Object();
//        Object o2 = new Object();
//        System.out.println(o1.equals(o2));
//        HashMap<String,String> map = new HashMap();
//        map.put("frist","hello");
//        String s = map.get("");
//        System.out.println(s);
        String s = "qta001 undefund";
        String end = s.replace("old","new");
        String end1 = s.replace("qta001","new1");
        System.out.println(end);
        System.out.println(end1);

//        try {
//            Map vars =new HashMap<>();
//            vars.put("seq","string");
//            FileWriter fileWriter = new FileWriter("D:\\整理\\test.txt",true);
//            BufferedWriter out = new BufferedWriter(fileWriter);
//            out.write(vars.get("seq")+"\n");
//            out.close();
//            fileWriter.close();
//        } catch (IOException e) {
//
//        }

        String old = "hkjhskhkh#$%^!!!hskahfu";
        String avgs = "[a-z@#$%^&*]";
        Pattern pattern = Pattern.compile(avgs);
        Matcher matcher = pattern.matcher(old);
        System.out.println(matcher.replaceAll(""));
    }

}