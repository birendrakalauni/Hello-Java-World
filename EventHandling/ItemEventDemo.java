package EventHandling;

import javax.swing.*;
import java.awt.event.*;

public class ItemEventDemo implements ItemListener {
    
    JCheckBox cb;

    ItemEventDemo()
    {
        JFrame f= new JFrame("Item Event Demo");
        cb= new JCheckBox("Java");
        cb.setBounds(100,50,100,50);
        cb.addItemListener(this);
        f.add(cb);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(cb.isSelected())
        {
            System.out.println("Selected");
        }
        else{
            System.out.println("Deselected");
        }
    }
    public static void main(String[] args)
    {
        new ItemEventDemo();

    }
}
