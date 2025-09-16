package com.niyaz.abstract_method_9sep;

public abstract class Cake 
{
	private String shape;
	private String flavor;
	private int qunatity;
	private static double price = 400;
	
	public Cake(String shape, String flavor, int qunatity) 
	{
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.qunatity = qunatity;
	
	}

	public String getShape() 
	{
		return shape;
	}

	public void setShape(String shape) 
	{
		this.shape = shape;
	}

	public String getFlavor() 
	{
		return flavor;
	}

	public void setFlavor(String flavor) 
	{
		this.flavor = flavor;
	}

	public int getQunatity()
	{
		return qunatity;
	}

	public void setQunatity(int qunatity)
	{
		this.qunatity = qunatity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "A "+shape+" "+flavor+" Cake Of "+qunatity+" KG is Ready @ Rs."+price*qunatity+"";

	}
}
   