package EventHandling;

import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo implements KeyListener
{
    KeyEventDemo()
    {
        JFrame f=new JFrame();
        JTextField tf= new JTextField();
        tf.setBounds(50,50,200,30);
        tf.addKeyListener(this);

        f.add(tf);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
   public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed");
    }
    public static void main(String[] args)
    {
        new KeyEventDemo();
    }
}
