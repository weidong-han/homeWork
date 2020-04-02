package com.work.swordhome.dataType;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @auther: weidong.han
 * @date: 2020/1/28
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new TreeMap<>(new xbComparator());
        hashmap.put("1",10);
        hashmap.put("10",100);
        hashmap.put("20",200);

        for (Map.Entry<String,Integer> entry:hashmap.entrySet()){
            System.out.println(entry.getKey());
        }


    }

}

class xbComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        return -s1.compareTo(s2);
    }
}

