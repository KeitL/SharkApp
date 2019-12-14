

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Game extends JComponent implements KeyListener {

    Shark shark = new Shark();
    Blood blood = new Blood();
    int step = 50;
    int x;
    int y;
    int score=0;


    public Game() {
        addKeyListener(this);
        setFocusable(true);

    }

    public void move() {
        shark.move();
        blood.move();
        if(shark.getBounds().intersects(blood.getBounds())){
            score++;
            //blood.dy=-1;
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            shark.x=shark.x+step;
            System.out.println(ke.getKeyLocation());
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            shark.x=shark.x-step;
            System.out.println(ke.getKeyLocation());


        }
        if(ke.getKeyCode() == KeyEvent.VK_UP) {
            shark.y=shark.y-step;

        }
        if(ke.getKeyCode() == KeyEvent.VK_DOWN) {
            shark.y=shark.y+step;
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        shark.paint(g);
        blood.paint(g);
        g.setFont(new Font("David", Font.PLAIN, 30));
        g.drawString(""+score, 30, 20);
    }


}


