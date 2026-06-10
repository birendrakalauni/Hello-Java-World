package JavaSwing;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
    public static void main(String[] args)
    {
        JFrame frame= new JFrame();
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
