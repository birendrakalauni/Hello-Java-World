package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutDemo {
    public static void main(String[] args)
    {
        JFrame frame= new JFrame("Null Layout");
        JButton btn= new JButton("Click");
        frame.setLayout(null);

        btn.setBounds(100, 50, 100, 30);
        frame.add(btn);

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
