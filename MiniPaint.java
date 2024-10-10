package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiniPaint extends JFrame {
    private JButton clearButton;
    private JPanel drawPanel;
    private Color currentColor = Color.BLACK;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MiniPaint miniPaint = new MiniPaint();
            miniPaint.setVisible(true);
        });
    }

    public MiniPaint() {
        setTitle("Mini Paint");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clearButton = new JButton("Clear");
        drawPanel = new JPanel() {
            private Point startPoint, endPoint;

            {
                setDoubleBuffered(false);
                addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        startPoint = e.getPoint();
                    }

                    public void mouseReleased(MouseEvent e) {
                        endPoint = e.getPoint();
                        drawLine(startPoint, endPoint);
                    }
                });
            }

            private void drawLine(Point startPoint, Point endPoint) {
                Graphics g = getGraphics();
                g.setColor(currentColor);
                g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
                g.dispose();
            }
        };

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawPanel.getGraphics();
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, drawPanel.getWidth(), drawPanel.getHeight());
                g.dispose();
            }
        });

        setLayout(new BorderLayout());
        add(clearButton, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);
    }
}
