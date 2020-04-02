package com.work.swordhome.myAgent.interview;

/**
 * @auther: weidong.han
 * @date: 2019/12/18
 */
public class TestArr {
    public static void main(String[] args) {
        int[] arr = {10,4,2,7,8,3};
        printArr(mp(arr));
        printArr(xz(arr));
    }
//选择排序思想：记录index，最外层与内层的数进行比较取最小值的index，然后在外层交换位置，这里不是直接移动数据，复杂度与冒泡一样
    public static int[] xz(int []arr){
        for (int i=0;i<arr.length;i++){
            int index = i;
            for (int j=i;j<arr.length;j++){
                if (arr[index]>arr[j]) {
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = arr[i];
        }
        return arr;
    }

    //冒泡排序，将最大值往后移动，时间复杂度不大于O(n^2)
    public static int[] mp(int []arr){
        for (int i=0;i<arr.length;i++){
            //因为每次将最大的值后置了，所以下一次遍历无需在遍历已经置后的位置了
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  tmp;
                }
            }
        }
        return arr;
    }

    public static void printArr(int []arr){
        String string ="排序后的数组为：";
        for (int i=0;i<arr.length;i++){
            string = string  + arr[i] +" ";
        }
        System.out.println(string);
    }
}