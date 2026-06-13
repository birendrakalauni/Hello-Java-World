package JavaSwing;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import java.awt.Color;

public class DialogDemo {
    public static void main(String[] args)
    {
        JDialog dialog = new JDialog();
        dialog.setTitle("Dialog Box");

        Color c= JColorChooser.showDialog(null, "Coose color", Color.DARK_GRAY);
        dialog.setSize(300, 200);
        dialog.setVisible(true); 
    }
}
