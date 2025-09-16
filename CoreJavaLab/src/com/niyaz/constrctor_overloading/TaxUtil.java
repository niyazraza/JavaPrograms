package com.niyaz.constrctor_overloading;

public class TaxUtil 
{

	public double calculateTax(Employee e) 
	{
		double tax=0;
		if(e.calculateGrossSalary()>50000) {
			 tax=e.calculateGrossSalary()*0.2;
			return tax;
		}
		else {
			 tax=e.calculateGrossSalary()*0.05;
		    return tax;
		}
		
	}
	public double calculateTax(Manager m) 
	{
		double tax=0;
		if(m.calculateGrossSalary()>50000) 
		{
			tax=m.calculateGrossSalary()*0.2;
			return tax;
		}
		else 
		{
			tax=m.calculateGrossSalary()*0.05;
			return tax;
		}
		
	}
	public double calculateTax(Trainer t)
	{
		double tax=0;
		if(t.calculateGrossSalary()>50000) 
		{
			tax=t.calculateGrossSalary()*0.2;
			return tax;
		}
		else 
		{
			tax=t.calculateGrossSalary()*0.05;
			return tax;
		}
		
	}
	public double calculateTax(Sourcing s)
	{
		double tax=0;
		if(s.calculateGrossSalary()>50000) 
		{
			tax=s.calculateGrossSalary()*0.2;
			return tax;
		}
		else 
		{
			tax=s.calculateGrossSalary()*0.05;
			return tax;
		}
	}
	
}
	

