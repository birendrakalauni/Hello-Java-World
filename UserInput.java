import java.util.Scanner;
 public class UserInput
 {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner (System.in);
        int[] numbers=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0; i<numbers.length;i++)
        {
            System.out.println("Enter Number:"+(i+1) +"");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("\n Array Elements:");
    }
    
 } 

