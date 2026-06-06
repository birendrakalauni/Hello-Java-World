//Deserialization
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

public class DeserializeDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis =
                new FileInputStream("employee.txt");

        ObjectInputStream ois =
                new ObjectInputStream(fis);

        Employee e = (Employee) ois.readObject();

        System.out.println("ID: " + e.id);
        System.out.println("Name: " + e.name);

        ois.close();
    }
}