package com.work.swordhome.myAgent.interview;

/**
 * @auther: weidong.han
 * @date: 2019/12/18
 */
public class TestArrFind {
    public static void main(String[] args) {
        int[] arr ={1,2,5,6,7,9,10,12,15,19,31,102,204,503};
        int target = 2000044;
        System.out.println(getIndex(getArr(), target));
        System.out.println(getIndexP(getArr(), target));
    }

    //二分查找法，前提是有序的。如果没有的话start会大于end则停止循环返回-1
    public static int getIndex(int[] arr,int target){
        long startTime = System.currentTimeMillis();
        int start =0;
        int end = arr.length -1;
        while (start <= end){
            int middle = (start + end) /2;
            if (target == arr[middle]) {
                System.out.println("二分法耗时："  + (System.currentTimeMillis() - startTime));
                return middle;
            }
            if (arr[middle] > target) {
                end = middle -1;
            }
            if(arr[middle] < target){
                start = middle +1;
            }
        }
        System.out.println("二分法耗时："  + (System.currentTimeMillis() - startTime));
        return -1;
    }

    public static int getIndexP(int[] arr,int target){
        long startTime = System.currentTimeMillis();
        int index = -1;
        for (int i =0;i<arr.length;i++){
            if (target == arr[i]){
               index = i;
            }
        }
        System.out.println("顺序查找法："  + (System.currentTimeMillis() - startTime));
        return index;
    }

    public static int[] getArr(){
        int[] arr = new int[10000000];
        for (int i =0;i<arr.length;i++){
            arr[i]=i+1;
        }
        return arr;
    }
}