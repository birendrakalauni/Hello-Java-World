import java.io.Console;

public class ConsoleInput {
   public static void main(String[] args)
   {
    Console c = System.console();
    if (c != null)
    {
        String username= c.readLine("UserName: ");
        char[] password= c.readPassword("Enter Password:");

        System.out.println("UserName: "+username);
    }

   } 
}
