import java.util.Scanner;

/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    public static void main(String[]args)
    {
        /*
         * we use scanner to take input from user
         * it is built-in type class
         */
        
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the firstNumber");
     int firstNumber=sc.nextInt();
     
     System.out.println("enter the secondNumber");
     int secondNumber=sc.nextInt();
     
     int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
     System.out.println("greatest number is" +bigger);
     
     
    
        
    }
    
   

}