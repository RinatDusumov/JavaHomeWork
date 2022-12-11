import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PopTheBalloon extends JFrame {
    final String TITLE_OF_PROGRAM = "Balls";
    static final int WINDOW_WIDTH = 500;
    static final int WINDOW_HEIGHT = 600;
    static Random random;
    static final Color[] COLORS = {Color.red, Color.green, Color.blue};
    static ArrayList<Ball> balls;
    int showDelay = 1000;
    int counter = 0;

    public static void main(String[] args) {
        new PopTheBalloon();
    }

    public PopTheBalloon() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setPreferredSize(new Dimension(WINDOW_WIDTH,
                WINDOW_HEIGHT));
        canvas.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent event) {
                deleteBall(event.getX(), event.getY());
                canvas.repaint();
            }
        });
        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        random = new Random();
        balls = new ArrayList<>();
        while (true) {
            Ball.addBall();
            if (balls.size() >= 5) {
                System.out.println("Game Over: " + counter);
                break;
            }
            canvas.repaint();
            counter++;
            if (counter % 10 == 0 && showDelay > 100) {
                showDelay -= 100;
            }
            try {
                Thread.sleep(showDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    void deleteBall(int x, int y) {
        for (int i = balls.size() - 1; i > -1; i--) {
            double dx = balls.get(i).x + balls.get(i).d/2 - x;
            double dy = balls.get(i).y + balls.get(i).d/2 - y;
            double d = Math.sqrt(dx * dx + dy * dy);
            if (d < balls.get(i).d/2) {
                balls.remove(i);
                break;
            }
        }
    }
    class Canvas extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            for (Ball ball : balls) {
               ball.paint(g);
            }
        }
    }
    static class Ball {
        int x, y, d;
        Color color;

        public Ball(int x, int y, int d, Color color) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.color = color;
        }
        void paint(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, d, d);
            g.setColor(Color.black);
            g.drawOval(x, y, d, d);
        }
        static void addBall() {
            int d = random.nextInt(20) + 60;
            int x = random.nextInt(WINDOW_WIDTH - d);
            int y = random.nextInt(WINDOW_HEIGHT - d);
            Color color = COLORS[random.nextInt(COLORS.length)];
            balls.add(new Ball(x, y, d, color));
        }
    }
}