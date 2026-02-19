import java.util.ArrayList; 
import java.util.Collections;

public class ArrayListt 
{
    public static void main(String[] args)
    {
      ArrayList<String> fruits = new ArrayList<>();

      fruits.add("Apple");

      fruits.add("Banana");

      fruits.add("Mango");

      fruits.add("Orange");

      System.out.println("Fruits: "+ fruits);
    System.out.println("First: "+ fruits.get(0));
    System.out.println("Size: "+ fruits.size());
    fruits.set(1,"Blueberry");
    System.out.println("After Modifying index 1: "+fruits);
     System.out.println("Contains Apple? :: "+fruits.contains("Apple"));
    Collections.sort(fruits);
     System.out.println("Sorted fruits:: "+fruits);
    fruits.clear();
     System.out.println("After Clear :: "+fruits);
    //   System.out.println("Empty Check: "+fruits.isEmpty());
    fruits.remove("Mango");
    // fruits.remove(2);
    System.out.println("After Modifying index 2: "+fruits);
    }
}
