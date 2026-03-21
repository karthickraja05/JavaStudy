package chatapp1;

import java.io.DataOutputStream;
import java.net.*;

public class SocketExmple {
    Socket socket;
    DataOutputStream dataOutputStream;

    public SocketExmple() {
        try {
            socket = new Socket("localhost", 9999);
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
            System.out.println("Connection error");
        }
    }

    public void socketSender(String message){
        try {
            dataOutputStream.writeUTF(message);
            dataOutputStream.flush();
        } catch (Exception e) {
            System.out.println("Send failed");
        }
    }
}