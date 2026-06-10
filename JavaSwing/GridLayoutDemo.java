package JavaSwing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2,2));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
