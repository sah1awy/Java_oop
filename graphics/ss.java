import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class ss  extends JFrame {
    public ss() {
        setSize(900, 700);
        setLocationRelativeTo(null);
        setTitle("graphic task 1");
        getContentPane().setBackground(Color.black);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.red);
        gg.setStroke(new BasicStroke(4));
        drawingRectangle(gg);
    }

    private void drawingRectangle(Graphics2D P) {
        Rectangle2D r = new Rectangle2D.Double(400, 200, 200, 200);
        P.draw(r);
        Rectangle2D r2 = new Rectangle2D.Double(600, 150, 50, 50);
        P.fill(r2);
        Rectangle2D r3 = new Rectangle2D.Double(350, 400, 50, 50);
        P.fill(r3);
        RoundRectangle2D r4 = new RoundRectangle2D.Double(425,225,150,150,150,150);
        P.setColor(Color.blue);
        P.fill(r4);
    }
}


