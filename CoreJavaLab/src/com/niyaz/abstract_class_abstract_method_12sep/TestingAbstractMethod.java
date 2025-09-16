package com.niyaz.abstract_class_abstract_method_12sep;

import java.util.Scanner;

public class TestingAbstractMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Shape shape1 = new  Rectangle (30.3,45.4);
		shape1.printDetails();
		System.out.println(".........................");
		
		Shape shape2 =new Circle(23.2);
		shape2.printDetails();
		System.out.println(".........................");
		
		Shape shape3 = new Triangle(146.2,40.0);
		shape3.printDetails();
		
		
	}

}
