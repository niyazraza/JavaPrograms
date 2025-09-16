package com.niyaz.blc_31_july;

public class Employee
{
	private String firstName;
	private String lastName;
	private int employeedId;
	private double salary;
	private int noOfProject;

	public Employee(String fName, String lName, int id, double sal, int project)
	{

		this.firstName = fName;
		this.lastName = lName;
		this.employeedId = id;
		this.salary = sal;
		this.noOfProject = project;

	}

	public double updateSalary()
	{
		double updateSalary;
		if(noOfProject < 0) 
		{
			System.err.println("Number of projects cannot be negative");
			System.exit(0);
			
		}

		if (noOfProject > 5 && noOfProject < 10) 
		{
			salary += 5000;
		} else if (noOfProject > 10 && noOfProject < 20)
		{
			salary += 10000;
		} else if (noOfProject > 20) 
		{
			salary += 15000;
		}

		updateSalary = salary;
		
		return updateSalary;
	}

	
	public String toString() 
	{
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeedId=" + employeedId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}
	
}
