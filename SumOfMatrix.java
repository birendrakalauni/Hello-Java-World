import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i,j,row,col;
        System.out.println("Enter the number of row elements:");
        row=sc.nextInt();
        System.out.println("Enter the number of elements of col");
        col= sc.nextInt();

        int[][] a= new int[row][col];
        int[][] b= new int[row][col];
        int[][] sum= new int[row][col];
        System.out.println("ENter the elements of 1st matrix: ");

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
                // System.out.print(a[][]+ " ");
            }
            // System.out.print();
        }
        System.out.println("ENter the elements of 2nd matrix: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                b[i][j]= sc.nextInt();
                // System.out.print(b[][]+ " ");
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        
        System.out.println("Sum of matrices:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++){
                System.out.print(sum[i][j]+ " ");

            }
            System.out.print("\n");
        }
    }
}
