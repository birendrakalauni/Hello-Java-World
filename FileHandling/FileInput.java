package FileHandling;
import java.io.*;
public class FileInput {
    
    public static void main(String[] args) throws Exception
    {
        FileInputStream fin= new FileInputStream("test.txt");
        int i;
        while ((i = fin.read()) != -1) {
            System.out.println((char) i);
            
        }
        fin.close();
    }
}
