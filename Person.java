//Concept of Encapsulation

 

public class Person {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Person myObj = new Person();

        // Use setter to set name
        myObj.setName("Harry!");

        // Use getter to get name
        System.out.println(myObj.getName());
    }
}
  

// public class Person {
//     private String name;
// //Getter
//     public String getName()
//     {
//        return name;
//     }
// //Setter
//     public void String setName(String newName)
//     {
//         this.name =newName;

//     }
//     public static void main(String[] args)
//     {
//       Person myObj= new Person();
//       myObj.name ="Harry!";
//       System.out.println(myObj.name);
//     }
    
// }
