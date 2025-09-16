package com.niyaz_31_july;

import com.niyaz.blc_31_july.Employee;

public class Tester
{

	public static void main(String[] args) 
	{
	
		Employee scott = new Employee("Md","Niyaz",121,10000,11);
		scott.updateSalary();
		System.out.println(scott);
		
		
	}

}
