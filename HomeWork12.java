import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
/**
 * Java Basic. Home work #12
 *
 * @author Rinat Dusumov
 * @todo 17.10.2022
 * @date 22.10.2022
 */

public class HomeWork12 extends JFrame {
    private static char[][] table = new char[3][3];
    private final String NAME = "Tic Tac Toe", RESTART = "Restart", EXIT = "Exit";
    private final int PANEL_SIZE = 400;
    private final int CELL_SIZE = PANEL_SIZE / 3;
    private boolean gameOver = false;
    Random random = new Random();

    public static void main(String[] args) {
        new HomeWork12();
    }
    public HomeWork12() {
        setTitle(NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();

        PaintPanel paintPanel = new PaintPanel();
        paintPanel.setBackground(Color.white);
        paintPanel.setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        paintPanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / CELL_SIZE;
                int y = e.getY() / CELL_SIZE;

                if (isCellValid(x, y) && !gameOver) {
                    table[x][y] = 'x';
                    if (isWin('x')) {
                        System.out.println("You won!");
                        gameOver = true;
                    }
                    if (isTableFull()) {
                        System.out.println("Sorry, draw!");
                        gameOver = true;
                    }
                    if (!gameOver) {
                        turnAI();
                        if (isWin('o')) {
                            System.out.println("Ai won!");
                            gameOver = true;
                        }
                        if (isTableFull()) {
                            System.out.println("Sorry, draw!");
                            gameOver = true;
                        }
                    }
                    paintPanel.repaint();
                }
            }
        });

        Button restart = new Button(RESTART);
        restart.addActionListener(e -> {
            init();
            gameOver = false;
            paintPanel.repaint();
        });
        Button exit = new Button(EXIT);
        exit.addActionListener(e -> System.exit(0));

        JPanel btnPanel = new JPanel();
        btnPanel.add(restart);
        btnPanel.add(exit);

        add(paintPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    boolean isWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) ||
                    (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)) return true;
        }
        if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
                (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) return true;
        return false;
    }
    boolean isTableFull () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
    void init() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = '.';
            }
        }
    }
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }
    private class PaintPanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.gray);
            for (int i = 1; i < 3; i++) {
                g.drawLine(0, CELL_SIZE * i, PANEL_SIZE, CELL_SIZE * i);
                g.drawLine(CELL_SIZE * i, 0, CELL_SIZE * i, PANEL_SIZE);
            }
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(10f));

            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (table[x][y] == 'x'); {
                        g2.setColor(Color.orange);
                        g2.drawLine(x * CELL_SIZE + CELL_SIZE / 5, y * CELL_SIZE
                                + CELL_SIZE / 5, (x + 1) * CELL_SIZE -
                                CELL_SIZE / 5, (y + 1) * CELL_SIZE - CELL_SIZE / 5);
                        g2.drawLine((x + 1) * CELL_SIZE - CELL_SIZE / 5, y * CELL_SIZE + CELL_SIZE / 5,
                                x * CELL_SIZE + CELL_SIZE / 5, (y + 1) * CELL_SIZE - CELL_SIZE / 5);
                    }
                    if (table[x][y] == 'o') {
                        g2.setColor(Color.red);
                        g2.drawOval(x * CELL_SIZE + CELL_SIZE / 5, y * CELL_SIZE + CELL_SIZE / 5,
                                CELL_SIZE - CELL_SIZE / 5 * 2, CELL_SIZE - CELL_SIZE / 5 * 2);
                    }
                }
            }
        }
    }
}