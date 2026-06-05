package FileHandling;

// import java.io.FileOutputStream;
import java.io.*;

public class FileOutput {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fout = new FileOutputStream("test.txt");
        String str="Hello, Java World";
        byte[] b= str.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("Data Written...");
    }
    
}
