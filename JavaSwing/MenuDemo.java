package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDemo {
    public static void main(String[] args)
    {
        JFrame frame =new JFrame("Menu Example");
        JMenuBar mb= new JMenuBar();
        JMenu file = new JMenu("File");
        mb.add(file);
        frame.setJMenuBar(mb);

        JMenuItem open= new JMenuItem("Open");
        file.add(open);
        JMenuItem naya = new JMenuItem("New");
        file.add(naya);

        frame.setSize(300,200);
        frame.setVisible(true);

    }
}
