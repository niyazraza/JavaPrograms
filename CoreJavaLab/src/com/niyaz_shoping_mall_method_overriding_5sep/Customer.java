package com.niyaz_shoping_mall_method_overriding_5sep;

public class Customer 
{
	protected String name;

	public Customer(String name)
	{
		super();
		this.name = name;
		if(name.equals("")||name==null) 
		{
			System.out.println("");
		}
	}
	public void calculateBill(double ...price)
	{   double sum=0;
		for(double p :price)
		{
			if(p<0) 
			{
			  System.err.println("Price should not be Negative");
			  System.exit(0);
			}
			sum+=p;
		}
		System.out.println("Welcome to Hyderabad Mall  ");
		System.out.println("Customer Name is :"+name);
		System.out.println("Total cost RS :"+sum);
		
		
		
	}
	

}
