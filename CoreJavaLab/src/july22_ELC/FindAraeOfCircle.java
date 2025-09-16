package july22_ELC;

import java.util.Scanner;

import july22_BLC.AreaOfCircle;

public class FindAraeOfCircle 
{

	public static void main(String[] args)
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter the radius of the circle:");
	  double radius = Double.parseDouble(sc.nextLine());
	  String circle =  AreaOfCircle.getAreaOfCircle(radius);
	  double   AreaOfCircle = Double.parseDouble(circle);
	  System.out.printf("area of circle is :%.2f",AreaOfCircle);
	  sc.close();
			  
	}

}
