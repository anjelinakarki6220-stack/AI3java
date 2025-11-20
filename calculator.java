import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
  public static void main(String[]args)
   {
       //TO TAKE INPUT
       Scanner sc=new   Scanner(System.in);
       System.out.println("Enter the First Number");
       int firstNumber=sc.nextInt();
       System.out.println("Enter the Second Number");
       int secondNumber=sc.nextInt();
       //PERFORMING THE CALCULATION
       
       int addition=firstNumber+secondNumber;
       int subtraction=firstNumber-secondNumber;
       int product=firstNumber*secondNumber;
       int division=firstNumber/secondNumber;
       int greatestnumber=firstNumber>secondNumber?firstNumber:secondNumber;
       int lowestnumber=firstNumber<secondNumber?firstNumber:secondNumber;
       
       //PRINTING
       System.out.println("Addition is" + addition);
        System.out.println("Subtraction is" + subtraction);
         System.out.println("Product is" + product);
          System.out.println("Division is" + division);
           System.out.println("greatest is" + greatestnumber);
            System.out.println("lowest is" + lowestnumber);
       
       
   }
}