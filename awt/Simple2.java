package awt;

import java.awt.*;
import java.awt.event.*;

public class Simple2{
    
    Simple2(){
        
    }

    public static void main(String[] args) {
        Simple2 simple = new Simple2();
        simple.createFrame();
        
    }

    public void createFrame(){
        Frame frame = new Frame("Simple App");
        Button btn = new Button("Click Me");
        // Button btn2 = new Button("Nofity Me!!");
        Label label = new Label("Simple App Form");
        TextField textField = new TextField("Enter your name: ");
        TextArea textArea = new TextArea();
        
        frame.add(label);
        frame.add(textField);
        frame.add(textArea);
        frame.add(btn);
        // frame.add(btn);

        // Add ActionListener to button
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = label.getText();
                if(value.equals("Button Clicked!")){
                    label.setText("Simple App Form");
                }else{
                    label.setText("Button Clicked!");
                }
                
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(1000,1000);
    }
}
