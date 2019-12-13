
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Shark {

    BufferedImage bi;

    public Shark() {
        try {
            bi= ImageIO.read(getClass().getResource("shark.png"));
        } catch (IOException ex) {
            Logger.getLogger(Shark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int x; //координаты по х
    int y; //координаты по y
    //final int Y = 450;
    double movement_dx = 10; //клетки по х
    int movement_dy = 1; //клетки по y
    final int SHARK_WIDTH = 150; // ширина акулы
    final int SHARK_HEIGHT = 50; // высота акулы

//    public void move() {
//        x += movement_dx;
//        if (x <= 0) {
//            movement_dx = 0;
//            x = 1;
//        }
//        if (x + SHARK_WIDTH >= 700) {
//            movement_dx = 0;
//            x -= 1;
//        }
//        y += movement_dy;
//        if (y <= 0) {
//            movement_dy = 0;
//            y = 1;
//        }
//        if (y + SHARK_HEIGHT >= 900) {
//            movement_dy = 0;
//            y -= 1;
//        }
//
//    }



    public void paint(Graphics g) {
        //g.fillRect(bi, x, y, SHARK_WIDTH, SHARK_HEIGHT);
        g.drawImage(bi, x, y,SHARK_WIDTH, SHARK_HEIGHT, null);
   // }
        ///g.setColor(Color.red);
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, SHARK_WIDTH, SHARK_HEIGHT);
    }
}
