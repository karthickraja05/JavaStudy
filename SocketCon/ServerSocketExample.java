package SocketCon;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class ServerSocketExample {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Hi Karthick");
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}
