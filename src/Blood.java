import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Blood {

    int x; //координаты по х
    int y; //координаты по y
    //final int Y = 450;
    double dx = 1; //клетки по х
    int dy = 1; //клетки по y
    final int DIAMETER = 25; // ширина акулы
    final int SHARK_HEIGHT = 25; // высота акулы

    BufferedImage bi;
    public Blood() {
        try {
            bi= ImageIO.read(getClass().getResource("blood.png"));
        } catch (IOException ex) {
            Logger.getLogger(Shark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  void move() {
        x+=dx;
        y+=dy;
        if(x+DIAMETER>400)
            dx=-1;
        if(x<0)
            dx=1;
        if(y<0)
            dy=1;
    }

    public void paint(Graphics g) {
        g.drawImage(bi, 100, 100,25, 25, null);
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, DIAMETER, SHARK_HEIGHT);
    }

    public static int generateRandomInt(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }
}
