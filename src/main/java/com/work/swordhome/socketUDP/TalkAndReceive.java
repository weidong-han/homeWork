package com.work.swordhome.socketUDP;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @auther: weidong.han
 * @date: 2020/2/23
 * 编写一个聊天程序，使用多线程控制，一个线程负责接收，一个线程负责发送
 * 思路：
 * 1、实现两个run方法
 * 2、在run方法中一个是负责监听键盘输入并发送，一个负责接收
 */
public class TalkAndReceive {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket1 = new DatagramSocket(10002);
        DatagramSocket socket2 = new DatagramSocket(10001);
        new Thread(new Demo01(socket1)).start();
        new Thread(new Demo02(socket2)).start();
    }

}

class Demo01 implements Runnable{

    private DatagramSocket client;
    public Demo01(DatagramSocket client){
        this.client = client;
    }
    @Override
    public void run() {
        try {
            while (true){
                //接收线程，
                byte[] data = new byte[1024];
                DatagramPacket packet = new DatagramPacket(data,data.length);
                client.receive(packet);
                System.out.println(new String(packet.getData(), 0, packet.getData().length));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}

class Demo02 implements Runnable {

    private DatagramSocket client;

    public Demo02(DatagramSocket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = reader.readLine()) !=null){
                DatagramPacket packet = new DatagramPacket(line.getBytes(),line.length(), InetAddress.getLocalHost(),10002);
                client.send(packet);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}