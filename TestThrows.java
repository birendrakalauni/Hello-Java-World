public class TestThrows {
    static void func(int a) throws ArithmeticException
    {
        System.out.println(10/a);
    }
    public static void main(String[] args)
    {
        try{
            func(10);
            func(5);
            func(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero!");
        }
    }
    
}
