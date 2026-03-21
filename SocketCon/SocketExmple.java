package SocketCon;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class SocketExmple {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost",9999);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String msg = dataInputStream.readUTF();
        System.out.println("Socket Message "+ msg);
    }
}
