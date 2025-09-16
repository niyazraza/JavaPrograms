package com.niyaz.abstract_method_10sep;

public class PhysicalProduct extends Product
{
	private double shippingWeight;

	public PhysicalProduct(String name, double price, String category, double shippingWeight) 
	{
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}
	
	double totalprice=0.0;
	@Override
	public void applyDiscount(double percentage)
	{ 
		double discount=getPrice()*percentage/100;
		   totalprice=getPrice()-discount;
		System.out.println("Discount applied :"+discount);
		System.out.println("New Price :"+totalprice);
	}

	@Override
	public double calculateTax() 
	{
	
		return totalprice*0.8;
	}
	
	public double calculateShippingCost() 
	{
		double shippingCost = shippingWeight*5;
		return shippingCost;
	}

	@Override
	public String toString() {
		return ""+super.toString() + "\nShipping Weight: "+shippingWeight+" kg";
	}

   
	
	
	

	
	

}
