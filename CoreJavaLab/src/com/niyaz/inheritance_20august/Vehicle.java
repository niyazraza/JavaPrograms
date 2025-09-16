package com.niyaz.inheritance_20august;

public class Vehicle 
{
	protected String make;
	protected String model;
	protected int year;
	
	public Vehicle(String make, String model, int year)
	{
		super();
		
		this.make = make;
		this.model = model;

		if(year<=0) 
		{
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.year = year;
	}
	public void displayDetails() 
	{
		System.out.println("make:"+make);
		System.out.println("model:"+model);
		System.out.println("year:"+year);
		
	}
	

}
