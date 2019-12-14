
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Shark {
    int x;
    int y;
    int dx = 0;
    int dy = 0;
    final int WIDTH = 100;
    final int HEIGHT = 100;

    BufferedImage bi;

    public Shark() {
        try {
            bi = ImageIO.read(getClass().getResource("shark.png"));
        } catch (IOException ex) {
            Logger.getLogger(Shark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void move() {
        x += dx;
        if (x <= 0) {
            dx = 0;
            x = 1;
        }
        if (x + WIDTH >= 600) {
            dx = 0;
            x -= 1;
        }
        y += dy;
        if (y <= 0) {
            dy = 0;
            y = 1;
        }
        if (y + HEIGHT >= 600) {
            dy = 0;
            y -= 1;
        }

    }


    public void paint(Graphics g) {
        g.drawImage(bi, x, y, WIDTH, HEIGHT, null);

    }


    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }
}
