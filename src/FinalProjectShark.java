import java.awt.*;
import java.util.Date;
import javax.swing.JFrame;

public class FinalProjectShark {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Shark Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        Game game = new Game();
        game.setPreferredSize(new Dimension(700, 700));
        frame.add(game, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.getSize();

        long startTime = System.currentTimeMillis();
        long elapsedTime = 0;

        while (elapsedTime < 60 * 1000) {
            long time = (60*1000) - elapsedTime;
            elapsedTime = (new Date()).getTime() - startTime;
            int seconds = (int)((time/ 1000) % 60);
            game.elapsedTime = seconds;
            game.move();
            game.repaint();
        }
        game.gameFinished();
    }
}
