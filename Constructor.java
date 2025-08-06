public class Constructor {  
    String name;
    int age;

    Constructor (String name, int age)
    {
        this.name=name;
        this.age=age;
    }
 void display()
 { 
    System.out.println(name);
    System.out.println(age);

 }
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        Constructor obj=new Constructor("Harry", 21);
        obj.display();
    }

    
}
