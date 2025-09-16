package com.niyaz.method_overloading_2Sep;

public class PartTimeEmployee extends Employee
{
	 protected double hourlyRate;
	 protected int hoursWorked;
	 
	 public PartTimeEmployee(int id, String name,double hourlyRate, int hoursWorked)
	 {
		super(id,name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		if(hoursWorked<0)
		{
			System.err.println("Employee hourly rate can't be zero OR Negative");
			System.exit(0);
		}
		if(hourlyRate<0) 
		{
			System.err.println("Employee hours of work can't be Negative");
			System.exit(0);
		}
	 }
	 public double calculateSalary() 
	 {
		 return hourlyRate*hoursWorked;
	 }	 
	 

}
