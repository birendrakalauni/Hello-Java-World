package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo {
    public static void main(String[] args)
    {
        String data[][]={
            {"1","RAmu"},
            {"2","HArry"},
            {"3","Kailu"}
        };
        String columns[]={
            "ID",
            "Name"
        };
        JTable table=new JTable(data, columns);
        JScrollPane sp= new JScrollPane(table);

        JFrame frame= new JFrame();
        frame.add(sp);
        
        frame.setSize(300,200);
        frame.setVisible(true);
    }
    
}
