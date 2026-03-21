package SnakeGame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Game{
    Frame frame;
    int score;
    Label points;
    int a,b;
    int x = 100;
    int y = 100;
    int size = 20;
    Canvas canvas;
    Canvas foodCanvas;

    int minX = 100;
    int maxX = 750;

    int minY = 100;
    int maxY = 750;

    Game(){
        frame = new Frame("Snake Game");

    }

    public void renderGame(){
        points = new Label("Score: 0");
        points.setBounds(50,50,300,30);
        frame.add(points);
        
        createFoodCanva();
        canvas = new Canvas(){
            public void paint(Graphics g){
                super.paint(g);

                // Draw Snake
                g.setColor(Color.BLUE);
                g.fillRect(x, y, size, size);

                // Draw Food
                g.setColor(Color.RED);
                g.fillRect(a, b, size, size);
            }
        };

        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                
                if (key == KeyEvent.VK_RIGHT) {
                    x += 10;
                } else if (key == KeyEvent.VK_LEFT) {
                    x -= 10;
                } else if (key == KeyEvent.VK_UP) {
                    y -= 10;
                } else if (key == KeyEvent.VK_DOWN) {
                    y += 10;
                }

                canvas.repaint(); // redraw after movement
            }
        });

        canvas.setBounds(0, 0, 800, 800);
        frame.add(canvas);

        frameRender();
    }

    public void createFoodCanva(){
        Random rand = new Random();
        a = rand.nextInt(maxX - minX + 1) + minX;
        b = rand.nextInt(maxY - minY + 1) + minY;
    }


    public void frameRender(){
        frame.add(canvas);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E){
                System.exit(0);
            }
        });
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    
    public static void main(String[] args) {
        Game game = new Game();   
        game.renderGame(); 
    }
}
