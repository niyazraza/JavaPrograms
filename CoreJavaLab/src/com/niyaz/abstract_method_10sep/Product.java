package com.niyaz.abstract_method_10sep;

public abstract class  Product 
{
     private String name;
     private double price;
     private String category;
     
	 public Product(String name, double price, String category)
	 {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		
		if(name.equals("")||name==null) 
		{
			System.err.println("Product name cannot be empty or null.");
			System.exit(0);
		}
		
		if(price<=0) 
		{
			System.out.println("Price cannot be negative.");
			System.exit(0);
		}
		
		if(category.equals("")||category==null) 
		{
			System.out.println("Category cannot be empty or null.");
			System.exit(0);
		}
	}
	 
	 public abstract void applyDiscount(double percentage);
	 public abstract double calculateTax();
	 
	 public double getPrice() 
	 {
		 return price;
	 }
	 public void setPrice(double price)
	 {
		 this.price = price;
	 }
	 @Override
	 public String toString()
	 {
		return "Product Name: "+name+"\n "+"Category: "+category+"\n "+"Price RS: "+price;
	 }
		 
	   
}
