package com.work.swordhome.socketTCP;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther: weidong.han
 * @date: 2020/3/2
 */
public class TcpSocketDemo02 {

    public static void main(String[] args) throws  Exception{
        ServerSocket serverSocket = new ServerSocket(10002);

        Socket client = serverSocket.accept();
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        System.out.println(new String(buf,0,len));
        //收到请求后对请求的客户端进行回复，这里要使用客户端的输出流
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("hello client!".getBytes());
        client.close();
        serverSocket.close();
    }
}

class SocketClient02{
    public static void main(String[] args) throws Exception{
        Socket client = new Socket(InetAddress.getLocalHost(),10002);
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("hello server!".getBytes());

        //收到回复后进行打印，这里要使用客户端的输入流
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[2];
        int len =0;
        StringBuffer buffer = new StringBuffer();
        while ((len = inputStream.read(buf))!=-1){
            //System.out.println(new String(buf,0,len));
            buffer.append(new String(buf,0,len));
        }
        System.out.println(buffer.toString());
        client.close();
    }
}

