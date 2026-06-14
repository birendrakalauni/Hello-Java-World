package EventHandling;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventDemo implements ActionListener{
    ActionEventDemo()
    {
        JFrame f = new JFrame();
        JButton b= new JButton("Click Me");
        b.setBounds(100,50,120,30);
        b.addActionListener(this);
        f.add(b);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button Clicked");
    }
    public static void main(String[] args)
    {
        new ActionEventDemo();
    }
    
}
