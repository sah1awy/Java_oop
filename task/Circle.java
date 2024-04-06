import javax.swing.*;
import java.awt.*;
public class Circle extends JFrame{
    public Circle(){

        setTitle("meow");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D gg = (Graphics2D) g;
        int xc = 250,yc = 250,w = 300, h = 300;
        int x = xc - (w/2);
        int y = yc - (h / 2);
        gg.setStroke(new BasicStroke(6));
        gg.drawOval(x,y,w,h);
        gg.drawLine(xc,yc,xc,yc);
    }
}
