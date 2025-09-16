package com.niyaz.method_overloading_26august;

import java.util.Scanner;

public class Overload
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ShapeCalculator cal = new ShapeCalculator();
		System.out.println("Enter the numbers:");
		
		int side=Integer.parseInt(sc.nextLine());
		System.out.println("Area of the Square:"+cal.calculateArea(side));
		
		System.out.println("Enter the numbers:");
		int length=Integer.parseInt(sc.nextLine());
		System.out.println("Area of the Rectangle:"+cal.calculateArea(length, length));
		System.out.println("Enter the numbers:");
		double radius = Double.parseDouble(sc.nextLine());
		System.out.println("Area of the Circle is:"+cal.calculateArea(radius));
		
		

	}

}
