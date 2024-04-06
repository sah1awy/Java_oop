package com.company;

import java.awt.*;
import javax.swing.JFrame;


class MyFrame extends JFrame{


    public MyFrame(){

        setTitle("welcome to graphics");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.cyan);

    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D gg = (Graphics2D)g;
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON );
        gg.setStroke(new BasicStroke(1));
        gg.setColor(Color.yellow);
        drawingArc(gg);
    }


    public void drawingArc(Graphics2D painter){
        painter.fillArc(getInsets().left-100,getInsets().top-100,200,200,0,-90);
        painter.fillArc(getInsets().left-100,getInsets().top-100,200,200,270,90);
        painter.fillArc(getInsets().left-100,getInsets().top-100,200,200,360,-90);
    }
}
public class Main {

    public static void main(String[] args) {
        MyFrame m = new MyFrame();
    }
}
