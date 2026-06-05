package FileHandling;

import java.io.RandomAccessFile;

public class RandomDemo {
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile file = new RandomAccessFile("text.txt", "rw");

        file.writeBytes("Java");
        file.seek(0);
        System.out.println((char) file.read());
        file.close();

    }
}
