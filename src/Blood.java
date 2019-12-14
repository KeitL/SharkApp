import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Blood {

    int x = generateRandomInt(700); //координаты по х
    int y = generateRandomInt(700); //координаты по y
    //final int Y = 450;
    double dx = 0; //клетки по х
    int dy = 0; //клетки по y
    final int DIAMETER = 25; // ширина акулы
    //final int SHARK_HEIGHT = 25; // высота акулы

    BufferedImage bi;

    public Blood() {
        try {
            bi = ImageIO.read(getClass().getResource("blood.png"));
        } catch (IOException ex) {
            Logger.getLogger(Shark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void move() {
        x += dx;
        y += dy;
        if(x+DIAMETER>600){
            x = generateRandomInt(600);
        }else if(y+DIAMETER>600){
            y = generateRandomInt(600);
        }
        if(x<0)
            dx=1;
        if(y<0)
            dy=1;
    }

    public void paint(Graphics g) {
        g.drawImage(bi, x, y, 50, 50, null);

    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }


}
