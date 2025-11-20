import java.util.Scanner;

/**
 * Write a description of class medicine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class medicine
{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" the name of medicine");
    String name=sc.nextLine();
    System.out.println(" the quantity of medicine");
    int quantity=sc.nextInt();
    System.out.println("price per tablet");
    float price=sc.nextFloat();
    
  
    System.out.println("enter the name of medicine");
    String medicinename=sc.nextLine();
    System.out.println(" enter the quantity of medicine");
    int medicinequantity=sc.nextInt();
    
    String checkingStock;
    checkingStock=(quantity>medicinequantity)?"in stock":"not in stock";
    
    float totalprice=price*medicinequantity;

    System.out.println() 

    
    
    
    
}
}