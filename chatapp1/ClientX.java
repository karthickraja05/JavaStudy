package chatapp1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ClientX {
    JFrame frame;
    JLabel label;
    JLabel errLabel;
    JButton btn1;
    JTextField input1;
    JLabel receivedMsg;

    ClientX(){
        frame = new JFrame();
        label = new JLabel("Enter your Message:");
        label.setBounds(100,100,200,50);
        
        errLabel = new JLabel("");
        errLabel.setBounds(100,200,200,50);
        errLabel.setForeground(Color.RED);

        input1 = new JTextField("");
        input1.setBounds(100,150,500,50);

        btn1 = new JButton("Send Message");
        btn1.setBounds(500,200,100,50);
        
        receivedMsg = new JLabel("");
        receivedMsg.setBounds(100,350,100,40);
        
    }

    public void render(){
        frame.add(label);
        frame.add(btn1);
        frame.add(input1);
        frame.add(receivedMsg);
        frame.add(errLabel);

        btn1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = input1.getText().trim();
                if(msg.length() == 0){
                    errLabel.setText("Please enter your message!!!");
                    removeMessage(errLabel);
                }else{
                    
                }
            }
        });


        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setVisible(true);
    }

    public void removeMessage(JLabel label){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                label.setText("");
            }
        }, 2000);
    }

    public static void main(String[] args) {
        ClientX client = new ClientX();
        client.render();
    }
}
