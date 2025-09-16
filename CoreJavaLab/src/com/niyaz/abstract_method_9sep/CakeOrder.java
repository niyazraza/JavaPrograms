package com.niyaz.abstract_method_9sep;

import java.util.Scanner;

public class CakeOrder
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the types of Cake");
		System.out.println("1.Default Cake");
		System.out.println("2.Quantity Cake");
		System.out.println("3.Quantity and Message Cake");
		
		
		
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) 
		{
		case 1->
		{
			Cake cake = new OrderedCake();
			System.out.println(cake);
			
		}
		case 2->
		{
			System.out.println("Enter the shape:");
			String shape = sc.nextLine();
			System.out.println("Enter the flavor:");
			String flavor = sc.nextLine();
			System.out.println("Enter the quantity:");
			int quantity = Integer.parseInt(sc.nextLine());
			Cake cake = new OrderedCake(shape,flavor,quantity);
			System.out.println(cake);
		}
		case 3->
		{
			System.out.println("Enter the shape:");
			String shape = sc.nextLine();
			System.out.println("Enter the flavor:");
			String flavor = sc.nextLine();
			System.out.println("Enter the quantity:");
			int quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the message:");
			String message = sc.nextLine();
			Cake cake = new OrderedCake(shape,flavor,quantity,message);
			System.out.println(cake);
		}
		}

	}

}
