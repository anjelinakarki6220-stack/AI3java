package Week3;


/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
  public static void main(String[]args)
  {
      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.BYTES);//snakecase for static variable
      System.out.println(Integer.SIZE);
      
      System.out.println(Float.MAX_VALUE+"\n"+Float.MIN_VALUE+"\n"+Float.BYTES+"\n"+Float.SIZE);
      
      byte b=12;//within the range we should assign the value
      byte d=13;
      byte e=(byte)(b+d);//explicite
      float f=233.3f;//f necessary
      long l=200l;
      int a=20;
      float g=2.33f;
      double h=2.332;
      double x=a+g+h;
      System.out.println(x);
      
//char int value
      char c='A';//when we add two characters its ascii value will be added
      System.out.println((int)c);
      
      //int char value
      int i=50;
      System.out.println((char)c);
      
      int length=10;
      int breadth=20;
      
      int Area= length* breadth;
      System.out.println(Area);
      
      int perimeter= length+breadth;
      System.out.println(perimeter);
      
      int principle=500;
      int time=2;
      float rate=2.4f;
      float simpleinterest=(principle*rate*time)/100;
      System.out.println(simpleinterest);
      
      double  amount =(float)principle*Math.pow(1 + rate/100.0, time);
        double CI = (float)amount - principle;
        System.out.println(CI);

      
      
      
      
      
      
      
      
  }
}