import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Blood {

    int current_location_x; //координаты по х
    int current_location_y; //координаты по y
    //final int Y = 450;
    double movement_dx = 10; //клетки по х
    int movement_dy = 1; //клетки по y
    final int SHARK_WIDTH = 25; // ширина акулы
    final int SHARK_HEIGHT = 50; // высота акулы

    BufferedImage bi;
    public Blood() {
        try {
            bi= ImageIO.read(getClass().getResource("blood.png"));
        } catch (IOException ex) {
            Logger.getLogger(Shark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void paint(Graphics g) {
        //g.fillRect(bi, x, y, SHARK_WIDTH, SHARK_HEIGHT);
        g.drawImage(bi, 100, 100,25, 100, null);
        // }
        ///g.setColor(Color.red);
    }

    public Rectangle getBounds(){
        return new Rectangle(current_location_x, current_location_y, SHARK_WIDTH, SHARK_HEIGHT);
    }
}
