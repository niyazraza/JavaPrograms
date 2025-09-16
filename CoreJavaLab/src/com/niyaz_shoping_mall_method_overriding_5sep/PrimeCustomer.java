package com.niyaz_shoping_mall_method_overriding_5sep;

public class PrimeCustomer  extends Customer
{ 
	protected double discountRate =0.10;

	public PrimeCustomer(String name) 
	{
		super(name);
	}
	
	public void calculateBill(double ...price)
	{
		//super.calculateBill(price);
		double total=0;
		double finalprice = 0;
		for(double p : price) 
		{
			total+=p;
		}
		finalprice=total-(total*discountRate);
		System.out.println("Welcome to Hyderabad Mall :");
		System.out.println("Customer Name is :"+name);
		System.out.println("Discount RS :"+total*discountRate);
		System.out.println("Total price RS :"+finalprice);
		
	}

	

}
