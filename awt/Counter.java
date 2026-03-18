package awt;

import java.awt.*;
import java.awt.event.*;

public class Counter {
    int counterValue;
    public static void main(String[] args) {
        Counter counter = new Counter();

        Frame frame = new Frame("Counter Button");

        Label value = new Label("0");
        Button btn1 = new Button("Increase");
        Button btn2 = new Button("Decrease");
        btn1.setBounds(200,150,100,30);
        value.setBounds(350,150,50,30);
        btn2.setBounds(400,150,100,30);
        value.setAlignment(Label.CENTER);
        frame.add(btn2);
        frame.add(value);
        frame.add(btn1);

        btn1.addActionListener(new ButtonIncrement(counter,value));
        btn2.addActionListener(new ButtonDecrement(counter,value));
        frame.setSize(600,600);
        frame.setLayout(null);
        
        frame.setVisible(true);

    }
}



class ButtonIncrement implements ActionListener{
    Counter counter;
    Label label;

    ButtonIncrement(Counter counter, Label label){
        this.counter = counter;
        this.label = label;
    }

    public void actionPerformed(ActionEvent e){
        counter.counterValue++; // increase
        label.setText(String.valueOf(counter.counterValue)); // update UI
    }
}

class ButtonDecrement implements ActionListener{
    Counter counter;
    Label label;

    ButtonDecrement(Counter counter, Label label){
        this.counter = counter;
        this.label = label;
    }

    public void actionPerformed(ActionEvent e){
        if(counter.counterValue > 0){
            counter.counterValue--;
        }
        label.setText(String.valueOf(counter.counterValue)); // update UI
    }
}