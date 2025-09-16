package com.niyaz.method_overloading_2Sep;

public class FullTimeEmployee extends Employee
{
	 protected double salary;

	 public FullTimeEmployee(int id,String name,double salary)
	 {
		super(id,name);
		this.salary = salary;
		if(salary<0) 
		{
			System.err.println("Salary can't be negative!!!");
			System.exit(0);
		}
	 }
	 public double calculateSalary()
	 {
		return this.salary;
		
	 }
	 

}
