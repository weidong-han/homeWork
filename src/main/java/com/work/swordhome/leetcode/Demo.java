package com.work.swordhome.leetcode;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println(getMax("abcafjdabfh"));
        for (int i = 0; i < 10; i++) {
            System.out.println("test");
            if (i == 5) {

            }

        }

    }

    /**
     * 求一个字符串中不重复的最大字串的长度
     * 1、使用hashset存储不重复的字串
     * 2、设置两个位置，up的位置先移动，如果没有重复的则继续往后移动，
     * 如果遇到重复的则把down的位置向后移动
     * 3、最终最大长度就是down到up的距离
     * <p>
     * 时间复杂度是:O(n)-O(2n),最坏的情况是每个元素都会被访问两边
     * 空间复杂度：
     */

    public static int getMax(String s) {
        Set<Character> set = new HashSet<>();
        int length = s.length();
        int up = 0, down = 0, max = 0;
        while (up < length && down < length) {
            if (!set.contains(s.charAt(up))) {
                set.add(s.charAt(up++));
                max = Math.max(max, up - down);
            } else {
                set.remove(s.charAt(down++));
            }
        }
        return max;
    }
}
