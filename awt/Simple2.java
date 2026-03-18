package awt;

import java.awt.*;

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
        Button btn2 = new Button("Nofity Me!!");

        frame.add(btn);
        frame.add(btn2);

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(1000,1000);
    }
}
