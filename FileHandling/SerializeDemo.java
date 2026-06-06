package FileHandling;
import java.io.*;
import java.io.Serializable;

class Employee implements Serializable{
    int id;
    String name;

    Employee(int id, String name)
    { 
        this.id=id;
        this.name=name;
    }

}

public class SerializeDemo {
    
    public static void main(String[] args) throws Exception
    {
        Employee e= new Employee(1, "Biren");

        FileOutputStream fos= new FileOutputStream("employee.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(e);
        oos.close();
        System.out.println("Objected created successfully!");
        
    }
}
