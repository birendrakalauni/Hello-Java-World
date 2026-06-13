package EventHandling;

import javax.swing.*;
import java.awt.event.*;

public class ActionCommandDemo implements ActionListener {
    ActionCommandDemo()
    {
        JFrame frame= new JFrame();
        JButton b1= new JButton("Add");
        JButton b2= new JButton("Delete");

        b1.setBounds(50, 50, 100, 30);
        b2.setBounds(170, 50, 100, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        frame.add(b1);
        frame.add(b2);

        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }   
    public void actionPerformed(ActionEvent e)
    {
        String cmd= e.getActionCommand();

        if(cmd.equals("Add"))
        {
            System.out.println("Add Clicked");
        }
        else
        {
            System.out.println("Delete Clicked");
        }
    }
    public static void main(String[] args)
    {
        new ActionCommandDemo();
    }
}