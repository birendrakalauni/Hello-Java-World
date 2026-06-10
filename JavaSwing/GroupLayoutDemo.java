package JavaSwing;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GroupLayoutDemo {
    public static void main(String[] args)
    {
        JFrame frame= new JFrame();
        JPanel panel= new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");

        layout.setHorizontalGroup(layout.createSequentialGroup()
        .addComponent(b1)
        .addComponent(b2));

        layout.setVerticalGroup(layout.createParallelGroup()
        .addComponent(b1)
        .addComponent(b2));

        panel.add(b1);
        panel.add(b2);

        frame.add(panel);

        frame.setSize(300,200);
        frame.setVisible(true);



    }
}
