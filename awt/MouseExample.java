package awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseExample implements MouseListener{
    Label status;
    
    Frame frame;

    MouseExample(){
        frame = new Frame("Mouse Listener");
        status = new Label("This is sample text");

        frame.add(status);

        frame.addMouseListener(this);

        // frame.addMouseListener(new MouseAdapter() {
        //     public void mouseClicked(MouseEvent E){ 
        //         status.setText("Welcome");
        //     }
        // });

        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent E){
                System.exit(0);
            }
        });


        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new MouseExample();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        status.setText("Mouse Clicked!!!");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        status.setText("Mouse Pressed!!!");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        status.setText("Mouse Released!!!");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        status.setText("Mouse Entered!!!");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        status.setText("Mouse Existed!!!");
    }

    
}
