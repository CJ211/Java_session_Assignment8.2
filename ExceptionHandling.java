import java.util.*;

//Defining Our own exception by extending Exception class
 
class NegativeAgeException extends Exception
{
    String errorMessage;
 
    public NegativeAgeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    
    public String toString()
    {
        return errorMessage;
    }
}

public class ExceptionHandling
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new NegativeAgeException("Age can not be negative");    //throws NegativeAgeException if age is negative
              }
		
		else
		{
			System.out.println("You have entered the age as : "+age);
		}
          }
          catch(NegativeAgeException ex)
          {
              System.out.println(ex);    //Output : Age can not be negative
          }
    }
}
