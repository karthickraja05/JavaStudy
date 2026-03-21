package chatapp1;

import java.io.DataInputStream;
import java.net.*;

public class ServerSocketExample {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("Server started...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            while (true) {
                String msg = dataInputStream.readUTF();
                System.out.println("Socket Message "+ msg);
            }
            // dataInputStream.close();
            // serverSocket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
