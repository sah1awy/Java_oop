import java.awt.Graphics;
import javax.swing.JFrame;
public class Main extends JFrame{

    public Main()
    {
        super("Circle In GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics gh)
    {
        super.paint(gh);
        //draw circle outline
        gh.drawOval(80,80,150,150);
    }
    public static void main(String[]args)
    {
        Main obj =new Main();
    }
}


