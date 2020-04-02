package com.work.swordhome.threadInfo;

import java.util.concurrent.*;

/**
 * @auther: weidong.han
 * @date: 2020/1/11
 */
public class LocalThreadTest {
    //这里创建一个固定数量的线程池
    static ExecutorService executorService = Executors.newFixedThreadPool(10);
    //创建一个单线程的线程池
    static ExecutorService singlePool = Executors.newSingleThreadExecutor();
    //创建一个根据需要自动创建线程的线程池
    static ExecutorService cachePool = Executors.newCachedThreadPool();
    //以上几种创建线程池的方式都是使用工厂方法，实际都是下边这种方式构造的
    static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10,10,0L,TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());

    //这里创建一个线程计数器，参数为线程数量，调用await方法的时候会根据这个数量来计数
    //比如这里的2意思是等待线程达到2个之后一起跑，也就是并发是2，如果设置的数量大于线程池的数量了则会一直等待
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread.sleep(200);
            executorService.submit(new LocalThreadTest().new RunNable(i,cyclicBarrier));
        }
        //调用shutdown后会给线程池一个信号，但不是立即停止而是等线程执行完毕后关闭。
        // isShutdown只是判断是否调用了shutdown方法
        // isTerminated方法才是判断是否已经关闭了连接池，一般使用这个
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        while (true){
            if (executorService.isTerminated()) {
                System.out.println("thread pool was shutdowned");
                break;
            }
        }
    }
    class RunNable implements Runnable{

        private int count;
        private CyclicBarrier cyclicBarrier;

        public RunNable(int count,CyclicBarrier cyclicBarrier){
            this.count = count;
            this.cyclicBarrier = cyclicBarrier;
        }
        @Override
        public void run() {
            try {
            System.out.println("then "+count+" is runnable");
            //这里调用await方法，意思是将传进来的线程等待所有的线程准备好了之后同时请求（并发模拟）
            this.cyclicBarrier.await();
            System.out.println("then "+count +" is begin running");
            } catch (Exception e) {

            }
        }
    }
}