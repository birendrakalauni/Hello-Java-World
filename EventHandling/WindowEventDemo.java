package EventHandling;

import javax.swing.*;
import java.awt.event.*;

public class WindowEventDemo extends WindowAdapter implements WindowListener {
    WindowEventDemo()
    {
        JFrame f= new JFrame();
        f.addWindowListener(this);
        f.setSize(300,200);
        f.setVisible(true);
    }
    // public void windowClosing(WindowEvent  e)
    // {
    //     System.out.println("Window Closed");
    //     System.exit(0);
    // }
    //  public void windowOpened(WindowEvent e) {}

    // public void windowClosed(WindowEvent e) {}

    // public void windowActivated(WindowEvent e) {}

    // public void windowDeactivated(WindowEvent e) {}

    // public void windowIconified(WindowEvent e) {}

    // public void windowDeiconified(WindowEvent e) {}

    
    //Now using WindowAdapter(Better Approach)
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closed!");

        System.exit(0);
    }


    
    public static void main(String[] args)
    {
        new WindowEventDemo();
    }

    
}
