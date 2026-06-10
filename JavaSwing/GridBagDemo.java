package JavaSwing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagDemo {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        GridBagLayout gbl= new GridBagLayout();
        GridBagConstraints gbc= new GridBagConstraints();

        frame.setLayout(gbl);

        JButton b1= new JButton("Btn 1");
        JButton b2= new JButton("Btn2");
        JButton b3= new JButton("Btn3");

        gbc.gridx=0;
        gbc.gridy=0;
        frame.add(b1,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        frame.add(b2,gbc);

        gbc.fill =GridBagConstraints.HORIZONTAL;
        gbc.gridwidth=3;
        gbc.gridx=0;
        gbc.gridy=1;
        frame.add(b3,gbc);

        frame.setSize(300,200);
        frame.setVisible(true);
    }
    
}
