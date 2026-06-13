package EventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton btn = new JButton("Click Me");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Button Clicked");
            }
        });
         frame.add(btn);
         frame.setSize(300,200);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
