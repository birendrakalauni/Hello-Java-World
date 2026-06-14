package EventHandling;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FocusDemo implements FocusListener {
    FocusDemo()
    {
        JFrame f= new JFrame();
        JTextField tf= new JTextField();
        tf.setBounds(50,50,200,30);
        tf.addFocusListener(this);

        f.add(tf);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        System.out.println("Focus Gained");
    }
    public void focusLost(FocusEvent e)
    {
        System.out.println("Focus Lost");
    }
    public static void main(String[] args)
    {
        new FocusDemo();
    }
    
}
