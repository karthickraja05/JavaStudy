package awt;

import java.awt.*;
import java.awt.event.*;

public class BallGame2 extends Frame implements MouseMotionListener {

    int circleX = 400;
    int circleY = 400;
    int circleRadius = 20;
    int speed = 5;

    Button restart;

    BallGame2() {

        // Restart Button
        restart = new Button("Restart");
        restart.setBounds(650, 50, 100, 30);

        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleX = 400;
                circleY = 400;
                repaint();
            }
        });

        add(restart);

        // Mouse Listener
        addMouseMotionListener(this);

        // Window Close
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setTitle("Ball Game");
        setLayout(null);
        setSize(800, 800);
        setVisible(true);
    }

    // Drawing the ball
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(circleX, circleY, 2 * circleRadius, 2 * circleRadius);
    }

    public static void main(String[] args) {
        new BallGame();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Not used
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int centerX = circleX + circleRadius;
        int centerY = circleY + circleRadius;

        // Smooth movement with threshold
        if (Math.abs(x - centerX) > 5) {
            circleX += (x > centerX) ? speed : -speed;
        }

        if (Math.abs(y - centerY) > 5) {
            circleY += (y > centerY) ? speed : -speed;
        }

        // Keep ball inside window
        circleX = Math.max(0, Math.min(circleX, getWidth() - 2 * circleRadius));
        circleY = Math.max(0, Math.min(circleY, getHeight() - 2 * circleRadius));

        repaint();
    }
}