class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

public class TestCustomException {
    static void validate(int age) throws InvalidAgeException
    {
        if (age<18)
        {
            throw new InvalidAgeException ("You are not eligible to vote!");
        }
        else{
            System.out.println("You can vote...");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            // validate(17);
            validate(22);
        }
        catch(InvalidAgeException ex)
        {
            System.out.println("Exception occurred: "+ ex.getMessage());
        }
    }
    
}
