import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
/**
 * Java Basic. Home work #10
 *
 * @author Rinat Dusumov
 * @todo 10.10.2022
 * @date 13.10.2022
 */
public class HomeWorkTenth extends JFrame {
    final private Color[] COLORS = {Color.red, Color.green, Color.blue, Color.magenta,
            Color.cyan, Color.orange, Color.pink, Color.gray, Color.black};
    private Random random = new Random();
    public static void main(String[] args) {
        new HomeWorkTenth();
        MyWindow myWindow = new MyWindow(0);
    }
    public HomeWorkTenth() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 500);
        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setBackground(Color.white);
        Button button = new Button("Repaint");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repaint");
                canvasPanel.repaint();
            }
        });
        add(canvasPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private class CanvasPanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < 50; i++) {
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                int x = random.nextInt(500);
                int y = random.nextInt(400);
                int dx = random.nextInt(100);
                int dy = random.nextInt(100);
                if (random.nextBoolean()) {
                    g.fillRect(x, y, dx, dy);
                } else {
                    g.fillOval(x, y, dx, dy);
                }
            }
        }
    }
}