public class InterfaceExample {
    interface Vehicle
    {
       void start();
    }
    public class Car implements Vehicle {
       public void start()
       {
        System.out.println("Car starts with a key...");
       }
        
    }
    public class Bike implements Vehicle {
       public void start()
       {
        System.out.println("Bike starts with a kick...");
       }
        
    }

    public static void main(String[] args)
    {
        InterfaceExample obj= new InterfaceExample();

        Vehicle car= obj.new Car();
        Vehicle bike=obj.new Bike();

        car.start();
        bike.start();
    }
    
}
