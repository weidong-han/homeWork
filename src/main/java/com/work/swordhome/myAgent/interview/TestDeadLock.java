package com.work.swordhome.myAgent.interview;

/**
 * @auther: weidong.han
 * @date: 2019/12/18
 * 下边是一个简单的死锁，其实因为先后启动的原因非真正意义上的死锁
 * 死锁原来很简单：大多是两个线程之间互相占用了锁导致的，如线程1占用lock1后去获取lock2 ，而线程2占用lock2后去获取lock1
 */
public class TestDeadLock {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "sleeping!");
                }
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "runing!");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "sleeping!");
                }
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "runing!");
                }
            }
        }).start();
    }

}