import java.util.Scanner;

public class Sum_Average {
    public static void main(String[] args )
    {
        int n, sum=0;
        float average;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements of Array:");
        n = s.nextInt();

        int a[]= new int[n];
        System.out.println("Enter the elements of Array: ");
        for(int i=0; i<n;i++)
        {
            a[i]= s.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum: "+sum);
        average= sum/n;
        System.out.println("Average:" +average);
        
    }
}
