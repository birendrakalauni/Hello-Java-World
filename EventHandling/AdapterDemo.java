package EventHandling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class AdapterDemo {
    public static void main(String[] args)
    {
        JFrame frame= new JFrame("Adapter Example");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.out.println(
                            "Window Closed");
                System.exit(0);
            }
        });
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
