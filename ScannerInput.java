import java.util.Scanner;
public class ScannerInput {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age= sc.nextInt();

        System.out.println("name: "+name);
        System.out.println("age:"+age);
          
        sc.close();
    }
}
