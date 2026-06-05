package FileHandling;
import java.io.*;


public class FileWriterDemo {

    public static void main(String[] args)
            throws Exception {

        FileWriter fw =
                new FileWriter("test.txt");

        fw.write("Welcome to Java");

        fw.close();

        System.out.println("Data Written");
    }
}
