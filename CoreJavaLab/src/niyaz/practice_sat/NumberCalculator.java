package niyaz.practice_sat;

import java.util.Scanner;

public class NumberCalculator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
	   String z=sc.nextLine();
	   switch (z) 
	   {
	   case "Add"  ->
	   System.out.println("Result is:"+(x+y));
	   case "Sub" ->
	   System.out.println("Result is :"+(x-y));
	   case "Mul" ->
	   System.out.println("Result is :"+(x*y));
	   case "Div" ->
	   {
		   if(y!=0) 
	   
	   System.out.println("Result is:"+z);
	   else
		   System.out.println("Cannot Divid by zero");
	   
	   }
	   default ->
	   System.out.println("Invalid choice");
	   }
	   
	   
	}
	

}
