package com.niyaz_shoping_mall_method_overriding_5sep;

public class VIPCustomer extends Customer
{
	protected double discountRate = 0.15;

	public VIPCustomer(String name, double discountRate)
	{
		super(name);
		this.discountRate = discountRate;
	} 
	public void calculateBill(double ...price) 
	{
		double total=0;
		double finalprice = 0;
		for(double p : price) 
		{
			total+=p;
		}
		
		System.out.println("Welcome to Hyderabad Mall :");
		System.out.println("Customer Name is :"+name);
		//System.out.println("Total cost RS :"+sum);
		System.out.println("Discount RS :"+finalprice);
		finalprice=total-(total*discountRate);
	}
   
}
