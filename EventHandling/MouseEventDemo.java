package EventHandling;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventDemo implements MouseListener{

    MouseEventDemo()
    {
        JFrame f= new JFrame();
        JButton b= new JButton("Click");
        b.setBounds(80,50,120,30);
        b.addMouseListener(this);

        f.add(b);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
    public static void main(String[] args)
    {
        new MouseEventDemo();
    }
    
}
