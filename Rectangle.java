import java.util.Scanner;

public class Rectangle {
    Scanner s = new Scanner(System.in);
    float l,b;
    void getData()
    {
      System.out.println("Enter the length and breath of rectangle: ");
      l=s.nextFloat();
      b=s.nextFloat();  
    }
    
    void displayArea()
    {
        float area;
    area=l*b;
        System.out.println("Area: "+area);
    }

   public static void main(String[] args)
   {
    Rectangle obj= new Rectangle();
    obj.getData();
    obj.displayArea();
   }

    
}