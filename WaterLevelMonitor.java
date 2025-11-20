import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
  public static void main(String[]args)
  {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the water level");
     int waterLevel=sc.nextInt();
        System.out.println("the water level is"+waterLevel);
        String warning;
         warning=(waterLevel>1000)?"Warning:Water level has reached 1000L!":"normal";
      System.out.println(warning);
      
      
        
        
        
        
        
        
        
        
      
  }
   
}