package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        DefaultMutableTreeNode root= new DefaultMutableTreeNode("BSc 7th Sem");
        DefaultMutableTreeNode java= new DefaultMutableTreeNode("Advanced Java Programming");
        DefaultMutableTreeNode pom= new DefaultMutableTreeNode("POM");
        DefaultMutableTreeNode dw_dm= new DefaultMutableTreeNode("DW&DM");
        
        root.add(java);
        root.add(pom);
        root.add(dw_dm);
        JTree tree = new JTree(root);

        frame.add(tree);

        frame.setSize(300,200);
        frame.setVisible(true);

    }
}
