package JavaSwing;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class InternalFrameDemo {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JDesktopPane desktop = new JDesktopPane();
        JInternalFrame internal= new JInternalFrame("Document", true, true, true, true);
        internal.setSize(200,150);
        internal.setVisible(true);

        desktop.add(internal);
        frame.add(desktop);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    
}
