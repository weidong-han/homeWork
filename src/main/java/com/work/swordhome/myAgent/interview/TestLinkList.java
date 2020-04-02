package com.work.swordhome.myAgent.interview;


/**
 * @auther: weidong.han
 * @date: 2019/12/31
 */
public class TestLinkList {


    class Node{
        Node next;
        String obj;

        public Node(String obj){
            this.obj = obj;
        }
    }

    public void getLastN(Node head,int n){
        Node fast = head;
        Node slow = head;
        int i =0;
        while (i<n-1){
            if (fast.next != null){
                fast = fast.next;
            }
            i++;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.obj);
    }
}