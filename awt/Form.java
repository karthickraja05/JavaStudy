package awt;

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import util.DataSave;

public class Form {
    
    public static void main(String[] args) {
        DataSave dataSave = new DataSave();
        
        Frame frame = new Frame("Form Submit");

        Label email = new Label("Email");
        email.setBounds(50,100,100,30);
        frame.add(email);

        TextField emailInput = new TextField("Enter your email");
        emailInput.setBounds(170,100,200 ,30);
        frame.add(emailInput);

        Label password = new Label("Password");
        password.setBounds(50,150,100,30);
        frame.add(password);

        TextField passwordInput = new TextField("Enter your password");
        passwordInput.setBounds(170,150,200 ,30);
        frame.add(passwordInput);

        Label age = new Label("Age");
        age.setBounds(50,200,100,30);
        frame.add(age);

        TextField ageInput = new TextField("Age");
        ageInput.setBounds(170,200,200 ,30);
        frame.add(ageInput);

        Button btn = new Button("Submit");
        btn.setBounds(170,250,100,30);
        frame.add(btn);

        Label message = new Label("");
        message.setBounds(170,300,200,30);
        frame.add(message);

        ActionListener obje = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(emailInput.getText());
                System.out.println(passwordInput.getText());
                System.out.println(ageInput.getText());
                message.setText("Data saved successfully!");
                removeMessage(message);
                dataSave.save(emailInput.getText(),passwordInput.getText(),ageInput.getText());
                emailInput.setText("");
                passwordInput.setText("");
                ageInput.setText("");
            }
        };

        btn.addActionListener(obje);
        
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

        
        
    }

    public static void removeMessage(Label message){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                message.setText("");
            }
        }, 2000);
    }

    


}
