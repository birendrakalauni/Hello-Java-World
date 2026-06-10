//Write a program to design a layout of a simple calculator. (Arithmetic operation not required.)
package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
    public static void main(String[] args)
    {
        JFrame frame= new JFrame("Simple Calculator");

        //Text field for display
        JTextField tf= new JTextField(70);
        tf.setEditable(false);
        
        //panel for buttons
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));

        //CAlculator buttons 
        String buttons[] ={
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","=","+","C"
        };
        for(String text: buttons)
        {
            panel.add(new JButton(text));
        }

        //Add components to frame
        frame.setLayout(new BorderLayout(5,5));
        frame.add(tf, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    
}
