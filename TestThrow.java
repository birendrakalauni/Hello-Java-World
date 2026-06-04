import java.util.Scanner;

public class TestThrow {

    static void canVote(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote!");
        } else {
            System.out.println("You can vote...");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Your Name: ");
        String name = s.nextLine();

        System.out.print("Enter your age: ");
        int age = s.nextInt();

        try {
            canVote(age);
            System.out.println("Welcome, " + name);
        }
        catch (ArithmeticException e) {
            System.out.println("Hello " + name);
            System.out.println(e.getMessage());
        }

        s.close();
    }
}