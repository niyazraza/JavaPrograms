package com.niyaz.inheritance_20august;

public class Car extends Vehicle
{
	protected int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) 
	{
		
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;

		if(numberOfDoors<=0) 
		{
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
	}
	public void displayDetails() 
	{
		
		super.displayDetails();
		System.out.println("numberOfDoors:"+numberOfDoors);
		
	}
	

}
