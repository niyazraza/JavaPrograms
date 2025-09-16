package com.niyaz.abstract_method_10sep;
import java.util.Scanner;
public class ProductStore
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Product Type:");
		System.out.println("1. Digital Product");
		System.out.println("2. Physical Product");
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) 
		{
		case 1 ->
		{
			System.out.println("Enter Digital Product Name :");
			String name = sc.nextLine();
			System.out.println("Enter Product Price :");
			double price = Double.parseDouble(sc.nextLine());
			System.out.println("Enter Product Category :");
			String category = sc.nextLine();
			System.out.println("Enter Product License Key :");
			String license = sc.nextLine();
			System.out.println("Enter the discount % on final bill");
			double discount = Double.parseDouble(sc.nextLine());
			DigitalProduct product = new DigitalProduct(name,price,category,license);
			System.out.println(product);
			product.applyDiscount(discount);
			System.out.println("Tax RS : "+product.calculateTax());
		}
		case 2->
		{
			System.out.println("Enter Digital Product Name :");
			String name = sc.nextLine();
			System.out.println("Enter Product Price :");
			double price = Double.parseDouble(sc.nextLine());
			System.out.println("Enter Product Category :");
			String category = sc.nextLine();
			System.out.println("Enter Product weight :");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.println("Enter Product License Key :");
			String license = sc.nextLine();
			System.out.println("Enter the discount % on final bill");
			double discount = Double.parseDouble(sc.nextLine());
			PhysicalProduct product1 = new PhysicalProduct(name,price,category,weight);
			System.out.println(product1);
			product1.applyDiscount(discount);
			System.out.println("Tax RS : "+product1.calculateTax());
			System.out.println("Shiping Cost RS "+product1.calculateShippingCost());
		}
		
		}
	}

}
