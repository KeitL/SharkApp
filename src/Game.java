

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener {

    Shark shark = new Shark();
    Blood blood = new Blood();
    int step = 100;
    int x;
    int y;
    int score=0;


    public Game() {
        addKeyListener(this);
        setFocusable(true);

    }

    public void move() {
        //shark.move();
        //blood.move();
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            shark.x = ke.getComponent().getX();
            if (shark.x +step<700){
                ke.getComponent().setLocation(shark.x +step, ke.getComponent().getY());
                ///System.out.println(ke.getComponent().get);
            }
//            if (blood.current_location_x<700){
//                ke.getComponent().setLocation(shark.x +10, ke.getComponent().getY());
//            }

        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            shark.x = ke.getComponent().getX();
            if (shark.x>0){
                ke.getComponent().setLocation(shark.x-step, ke.getComponent().getY());
            }

        }
        if(ke.getKeyCode() == KeyEvent.VK_UP) {
            shark.y = ke.getComponent().getY();
            if(shark.y>0){
                ke.getComponent().setLocation(ke.getComponent().getX(), shark.y-step);
            }
        }
        if(ke.getKeyCode() == KeyEvent.VK_DOWN) {
            shark.y = ke.getComponent().getY();
            if (shark.y+step<700){
                ke.getComponent().setLocation(ke.getComponent().getX(), shark.y+100);
            }

        }
        //if (ke)

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        shark.paint(g);
        blood.paint(g);
        ///g.setFont(new Font("David", Font.PLAIN, 30));
        ///g.drawString(""+score, 30, 20);
    }


}


