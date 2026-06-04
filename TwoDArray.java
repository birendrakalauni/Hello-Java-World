public class TwoDArray {
    public static void main(String[] args)
    {
        int[][] a={{3,5,7},{4,6,8},{1,2,3}};
        for(int i=0; i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
