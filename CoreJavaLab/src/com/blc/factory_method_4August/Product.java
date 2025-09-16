package com.blc.factory_method_4August;

import java.util.Scanner;

public class Product 
{
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	

	

	public static Product  createProductObject() 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the id:");
	    int id = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("enter the name:");
	    String name = sc.nextLine();
	    
	    System.out.println("enter the price:");
	    double price = Double.parseDouble(sc.nextLine());
	    
	    System.out.println("enter the qantity:");
	    int quantity = Integer.parseInt(sc.nextLine());
	    
	    return new Product (id,name, price, quantity);
}


	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ",Final amount after discount=]"+calculateTotalAmount( price, quantity);
	}
	
	public static double calculateTotalAmount(double price,int quantity)
	{
		
		double total = price * quantity;
 		double discount = 0;
 		
		if(total>1000) 
		{
			discount  = total *0.1;
		}
		
		else if(total>500) 
		{
			discount = total*0.5;
		}
		
		else 
		{
			System.out.println("no discount");
		}
		return total - discount;
	}
	
	
}
