package com.niyaz_shoping_mall_method_overriding_5sep;

public class GeneralCustomer extends Customer
{

	public GeneralCustomer(String name) 
	{
		super(name);
	}
	@Override
	public void calculateBill(double ...price) 
	{
	   super.calculateBill(price);
	   System.out.println("Discount: No discount for general customers.");
	}
	
	
	
	

	

}
