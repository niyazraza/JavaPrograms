package niyaz.blc;
import java.util.Scanner;
public class CarBLC
{
      String name;
      String brandname;
      String color;
      int milege;
      double price;
      
      public void cardata() 
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the car name:");
    	  name = sc.nextLine();
    	  
    	  System.out.println("Enter the brandname:");
    	  brandname = sc.nextLine();
    	  
    	  System.out.println("Enter the car color:");
    	  color =sc.nextLine();
    	  
    	  System.out.println("Enter the car milege:");
    	  milege =sc.nextInt();
    	  
    	  System.out.println("Enter the car price:");
    	  price =sc.nextDouble();
    	  sc.close();
    	  
      }
      
      public void getcarinformation() 
      {
    	  System.out.println("Car name is:"+name);
    	  System.out.println("Brandname is:"+brandname);
    	  System.out.println("Car color is:"+color);
    	  System.out.println("Car milege is:"+milege);
    	  System.out.println("Car price is:"+price);
    	  
      }
}
