package SocketCon;

import java.net.*;

public class DatagramServerExample {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();
        String msg = "Hi Client";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), msg.length(),ip,9999);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }    
}
