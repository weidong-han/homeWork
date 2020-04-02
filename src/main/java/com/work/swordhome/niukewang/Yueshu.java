package com.work.swordhome.niukewang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Yueshu {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] arr  = s.split(" ");
            long start = System.currentTimeMillis();
            demo(Integer.valueOf(arr[0]),Integer.valueOf(arr[1]));
            System.out.println("耗时："+(System.currentTimeMillis() - start));
        }
//        long start = System.currentTimeMillis();
//        demo(3,8);
//        System.out.println("耗时："+(System.currentTimeMillis() - start));
    }


    public static void demo(int j,int r){
        Map<Integer,Integer> hashMap = new HashMap();
        startMap(hashMap);
        for(int x = j;x<=r;x++){
            for(int y=1;y<=x;y++){
                if(x % y == 0){
                    int tmp = getFrist(y);
                    if(!hashMap.keySet().contains(tmp)){
                        hashMap.put(tmp,1);
                    }else{
                        hashMap.put(tmp,hashMap.get(tmp)+1);
                    }
                }
            }

        }
        Iterator iter = hashMap.keySet().iterator();
        while(iter.hasNext()){
            System.out.println(hashMap.get(iter.next()));
        }
    }

    public static Integer getFrist(int value){
        return Integer.valueOf(String.valueOf(value).charAt(0)+"");
    }

    public static void startMap(Map<Integer,Integer> map){
        for (int i=1;i<10;i++) {
            map.put(i,0);
        }
    }
}
