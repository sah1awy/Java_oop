import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class test extends JFrame {
    public test(){

        setSize(600,600);
        setLocationRelativeTo(null);
        setTitle("graphics task 1");
        getContentPane().setBackground(Color.black);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint (Graphics g) {
        super. paint (g);
        Dimension s= getSize();

        Random r =new Random();
        for (int i=1;i<100;i++) {
            int x = Math.abs(r.nextInt()%s.width);
            int y = Math.abs(r.nextInt()%s.height);

            g.setColor(Color.white);
            g.drawLine(x,y,x,y);

        }
    }
}
