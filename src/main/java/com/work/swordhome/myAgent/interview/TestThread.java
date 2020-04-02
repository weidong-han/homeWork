package com.work.swordhome.myAgent.interview;

/**
 * @auther: weidong.han
 * @date: 2019/12/18
 * thread跟runnable的区别：
 * 1、没有本质的区别，只不过Thread是被我们自己的线程继承的，那就不能在继承其他的类，扩展性不太好；而runnable是需要我们的线程去实现的，同时它可以实现其他接口
 * 2、如果实现runnable，也是需要thread类的start方法启动，因为runnable没有start方法
 * 3、继承Thread类的子类可以直接new完后调用start方法，比如 new MyThread().start();
 * 4、实现runnable的子类只能把new出来的对象作为参数放进new出来的Thread类后再调start方法，如：new Thread(myThread).start();
 * 5、网上说的runnable实现能共享资源，而thread不行。其实不是，这里的问题是：
 *  1）实现runnable：
 *      这里只是声明了一次，两个线程操作的是一个对象，所以MyRunnable里的变量相当于被两个线程操作了
 *  Runnable runnable = new MyRunnable();
    new Thread(runnable).start();
    new Thread(runnable).start();
    2）继承thread：
        这里仔细看，实际是声明了两遍，new出来两个内存地址，两个线程分别操作各自的对象，当然不可能共用一个变量了
    new MyThread().start();
    new MyThread().start();
 * 6、这里还有一个问题是如果想多个线程操作多个对象的时候还想用一个变量，将变量设置成static的话就很接近真相了，但是还有问题
 * 所以这里需要加锁来，只有使用锁才能在线程进来的时候不至于操作多次，详细请看下边的代码
 */
public class TestThread {
    public static void main(String[] args) {

//        new MyThread().start();
//        new MyThread().start();

//        Thread myThread = new MyThread();
//        new Thread(myThread,"thread-1").start();
//        new Thread(myThread,"thread-2").start();
//        new Thread(myThread,"thread-3").start();

        Runnable runnable = new MyRunnable();
        Runnable runnable1 = new MyRunnable();
        new Thread(runnable).start();
        new Thread(runnable1).start();

    }


    static class MyThread extends Thread{
        private int ticket = 10;
        public void run(){
            while(true){
                synchronized (this) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + ":Thread ticket = " + ticket--);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    static class MyRunnable implements Runnable{
        private int ticket = 5;
        @Override
        public void run(){
            while(true){
                synchronized (this){
                    if (ticket > 0){
                        System.out.println("Thread ticket = " + ticket--);
                    }else {
                        break;
                    }
                }
            }
        }
    }
}