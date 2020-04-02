package com.work.swordhome.myAgent.interview;

/**
 * @auther: weidong.han
 * @date: 2019/12/9
 */
public class testDemo {
    public static void main(String[] args) {
//        Map<String,String> orderNoBillNoMap = new HashMap<>();
//        String s = orderNoBillNoMap.get("none");
//        System.out.println(s);
        System.out.println(getMax("abbdddssssssssddddddsssssssssffffffcbbcaaas"));
        String string = "aabbeccccd";
        System.out.println(getStr(string));
        System.out.println(getStr02(string));
    }
    //aabbeccccd 转换成2a2b1e4c1d
    public static String getStr(String string){
        String s = "";
        char[] arrays = string.toCharArray();
        for (int i =0;i<arrays.length;i++){
            char c= arrays[i];
            int count = 1;
            for (int j = i+1;j<arrays.length;j++){
                if (c == arrays[j]) {
                    count +=1;
                }else {
                    break;
                }
                i=j;
            }
            s= s+count+c;
        }
        return s;
    }
    //aabbeccccd 转换成2a2b1e4c1d
    public static String getStr02(String str){
        String s = "";
        char[] arr = str.toCharArray();
        int count =1;
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]) {
                count +=1;
            }else{
                s = s+count+arr[i];
                count =1;
                if(i==arr.length-2){
                    s = s+count+arr[i+1];
                }
            }
        }
        return s;
    }

//获取字符串中出现次数最多的字符和次数
    public static int getMax(String str){
        String s = "";
        int count =1;
        int maxCount = 0;
        String b ="";
        int num =0;
        char[] arr = str.toCharArray();
        for (int i =0; i< arr.length-1;i++){
            char a = arr[i];
            if (s.contains(String.valueOf(a))) {
                continue;
            }
            for (int j =i+1;j<arr.length;j++){
                num +=1;
                if (a == arr[j]){
                    count +=1;
                }
            }
            s = s + count +a;
            if(maxCount < count){
                maxCount = count;
                b= String.valueOf(a);
            }
            count =0;
        }
        System.out.println("出现最多的字符为：" + b+"\n" +"数量为："+maxCount);
        System.out.println("共遍历次数为："+num);
        return maxCount;
    }
}