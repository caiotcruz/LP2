import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

class Hello2DFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public Hello2DFrame() {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("Java2D - Hello World!");
        this.setSize(1920, 1080);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.RED);
        g2d.drawArc(851, 390, 250, 250, 180, 65);
        g2d.drawArc(747, 390, 250, 250, 0, -65);
        g2d.drawArc(852, 470, 72, 90, 180, -181);
        g2d.drawArc(925, 470, 72, 90, 0, 181 );
        g2d.setPaint(Color.PINK);
        g2d.drawString("Me aprova por favor",865, 440);
        g2d.setPaint(Color.MAGENTA);
        g2d.drawOval(650, 290, 560, 560 );
    }
}