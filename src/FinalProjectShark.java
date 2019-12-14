import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class FinalProjectShark {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Shark Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setResizable(true);
        frame.setLayout(new BorderLayout());
        Game game = new Game();
        System.out.println(game.getHeight());
        System.out.println(game.getWidth());

        game.setPreferredSize(new Dimension(700, 700));
        frame.add(game, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.getSize();
        System.out.println(frame.getSize());

        while (true) {
            game.move();
            game.repaint();
        }

    }
}
