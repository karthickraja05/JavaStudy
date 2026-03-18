package awt;

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import util.DataSave;

public class Form {
    DataSave file;
    Label email;
    Label password;
    Label age;
    Label message;
    TextField emailInput;
    TextField passwordInput;
    TextField ageInput;
    Frame frame;
    Button btn;

    Form(DataSave file){
        this.file = file;
        this.frame = new Frame();
    }

    public void render(){
        addWidgets();
        listen();
    }

    public void listen(){
         ActionListener obje = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                message.setText("Data saved successfully!");
                removeMessage(message);
                file.save(emailInput.getText(),passwordInput.getText(),ageInput.getText());
                emailInput.setText("");
                passwordInput.setText("");
                ageInput.setText("");
            }
        };

        btn.addActionListener(obje);
    }

    public void addWidgets(){
        email = new Label("Email");
        email.setBounds(50,100,100,30);
        frame.add(email);

        emailInput = new TextField("Enter your email");
        emailInput.setBounds(170,100,200 ,30);
        frame.add(emailInput);

        password = new Label("Password");
        password.setBounds(50,150,100,30);
        frame.add(password);

        passwordInput = new TextField("Enter your password");
        passwordInput.setBounds(170,150,200 ,30);
        frame.add(passwordInput);

        age = new Label("Age");
        age.setBounds(50,200,100,30);
        frame.add(age);

        ageInput = new TextField("Age");
        ageInput.setBounds(170,200,200 ,30);
        frame.add(ageInput);

        btn = new Button("Submit");
        btn.setBounds(170,250,100,30);
        frame.add(btn);

        message = new Label("");
        message.setBounds(170,300,200,30);
        frame.add(message);

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        DataSave dataSave = new DataSave();
        Form form = new Form(dataSave);
        form.render();
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
