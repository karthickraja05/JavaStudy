package awt;

import java.awt.*;

public class Simple extends Frame{
    
    Simple(){
        Button btn = new Button("Click Me");
        Button btn2 = new Button("Nofity Me");

        add(btn);
        add(btn2);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(100,100);
    }

    public static void main(String[] args) {
        Simple simple = new Simple();
    }
}
