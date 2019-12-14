

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

public class Game extends JPanel implements KeyListener {

    Blood blood = new Blood();
    Shark shark = new Shark();
    int elapsedTime = 0;

    int step = 50;
    int score = 0;


    public Game() {
        addKeyListener(this);
        setFocusable(true);
        setBackground(new Color(187, 222, 251));

    }

    public void move() {
        blood.move();
        shark.move();
        if (shark.getBounds().intersects(blood.getBounds())) {
            score++;
            blood.x = generateRandomInt(700);
            blood.y = generateRandomInt(700);
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            shark.x = shark.x + step;
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            shark.x = shark.x - step;
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            shark.y = shark.y - step;

        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            shark.y = shark.y + step;
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
        g.drawString("Result: " + score, 300, 60);
        g.drawString("Get as much blood as you can in "+elapsedTime+ " seconds", 100, 30);

    }

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }


    public void gameFinished() {
        JOptionPane.showMessageDialog(null, "Game finished. You get " + score + " points. " + getResult());
        System.exit(1);
    }

    String getResult() {
        String result = "";
        if (score > 0) {
            result = "Please try harder!";
        } else if (score > 20) {
            result = "You can do better!";
        } else if (score > 30) {
            result = "Good job!!!";
        } else if (score > 30) {
            result = "You are super star!!!";
        }
        return result;
    }


}


