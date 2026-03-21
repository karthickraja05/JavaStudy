package SocketCon;

import java.net.*;

public class DatagramClientExample {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, 1024);
        datagramSocket.receive(datagramPacket);

        String msg = new String(datagramPacket.getData());
        System.out.println(msg);
        datagramSocket.close();
    }
}
