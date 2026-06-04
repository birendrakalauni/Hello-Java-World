public class ExceptionDemo {
    public static void main(String[] args){
        try {
            int divideByZero=7/0; //Code that generate exception

        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithematic exception =>  " + e.getMessage());
        }
        finally{
            System.out.println("This is the finally block...");

        }
    }
    
}
